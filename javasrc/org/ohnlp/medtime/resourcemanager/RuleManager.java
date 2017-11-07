/*******************************************************************************
 * Copyright: (c)  2013  Mayo Foundation for Medical Education and 
 *  Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 *  triple-shield Mayo logo are trademarks and service marks of MFMER.
 *  
 *  Except as contained in the copyright notice above, or as used to identify 
 *  MFMER as the author of this software, the trade names, trademarks, service
 *  marks, or product names of the copyright holder shall not be used in
 *  advertising, promotion or otherwise in connection with this software without
 *  prior written authorization of the copyright holder.
 *  
 *  MedTime is free software: you can redistribute it and/or modify it under the 
 *  terms of the GNU General Public License as published by the Free Software 
 *  Foundation, either version 3 of the License, or (at your option) any later version.
 *  
 *  MedTime is distributed in the hope that it will be useful, but WITHOUT ANY 
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 *  FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with MedTime.  If not, see http://www.gnu.org/licenses/.
 *
 *******************************************************************************/
package org.ohnlp.medtime.resourcemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

import org.ohnlp.medtime.util.Logger;
import org.ohnlp.medtime.util.Toolbox;
/**
 * 
 * This class fills the role of a manager of all the rule resources.
 * It reads the data from a file system and fills up a bunch of HashMaps
 * with their information.
 * 
 *
 */
public class RuleManager extends GenericResourceManager {
	private static RuleManager INSTANCE = null;
	
	// PATTERNS TO READ RESOURCES "RULES" AND "NORMALIZATION"
	Pattern paReadRules          = Pattern.compile("RULENAME=\"(.*?)\",EXTRACTION=\"(.*?)\",NORM_VALUE=\"(.*?)\"(.*)");
	
	// EXTRACTION PARTS OF RULES (patterns loaded from files)
	HashMap<Pattern, String> hmDatePattern     = new HashMap<Pattern, String>();
	HashMap<Pattern, String> hmDurationPattern = new HashMap<Pattern, String>();
	HashMap<Pattern, String> hmTimePattern     = new HashMap<Pattern, String>();
	HashMap<Pattern, String> hmSetPattern      = new HashMap<Pattern, String>();

	// NORMALIZATION PARTS OF RULES (patterns loaded from files)
	HashMap<String, String> hmDateNormalization     = new HashMap<String, String>();
	HashMap<String, String> hmTimeNormalization     = new HashMap<String, String>();
	HashMap<String, String> hmDurationNormalization = new HashMap<String, String>();
	HashMap<String, String> hmSetNormalization      = new HashMap<String, String>();
	
	// OFFSET PARTS OF RULES (patterns loaded from files)
	HashMap<String, String> hmDateOffset     = new HashMap<String, String>();
	HashMap<String, String> hmTimeOffset     = new HashMap<String, String>();
	HashMap<String, String> hmDurationOffset = new HashMap<String, String>();
	HashMap<String, String> hmSetOffset      = new HashMap<String, String>();
	
	// QUANT PARTS OF RULES (patterns loaded from files)
	HashMap<String, String> hmDateQuant     = new HashMap<String, String>();
	HashMap<String, String> hmTimeQuant     = new HashMap<String, String>();
	HashMap<String, String> hmDurationQuant = new HashMap<String, String>();
	HashMap<String, String> hmSetQuant      = new HashMap<String, String>();

	// FREQ PARTS OF RULES (patterns loaded from files)
	HashMap<String, String> hmDateFreq     = new HashMap<String, String>();
	HashMap<String, String> hmTimeFreq     = new HashMap<String, String>();
	HashMap<String, String> hmDurationFreq = new HashMap<String, String>();
	HashMap<String, String> hmSetFreq      = new HashMap<String, String>();

	// MOD PARTS OF RULES (patterns loaded from files)
	HashMap<String, String> hmDateMod     = new HashMap<String, String>();
	HashMap<String, String> hmTimeMod     = new HashMap<String, String>();
	HashMap<String, String> hmDurationMod = new HashMap<String, String>();
	HashMap<String, String> hmSetMod      = new HashMap<String, String>();

	// POS PARTS OF RULES (patterns loaded from files)
	HashMap<String, String> hmDatePosConstraint     = new HashMap<String, String>();
	HashMap<String, String> hmTimePosConstraint     = new HashMap<String, String>();
	HashMap<String, String> hmDurationPosConstraint = new HashMap<String, String>();
	HashMap<String, String> hmSetPosConstraint      = new HashMap<String, String>();

	/**
	 * Constructor calls the parent constructor that sets language/resource
	 * parameters and collects rules resources.
	 * @param language language of resources to be used
	 */
	private RuleManager(String language, String resourceDir) {
		// Process Generic constructor with rules parameter
		super("rules");
		
		///////////////////////////////////////////////////
		// READ RULE RESOURCES FROM FILES AND STORE THEM //
		///////////////////////////////////////////////////
		HashMap<String, String> hmResourcesRules = readResourcesFromDirectory();
		readRules(hmResourcesRules);
	}

	/**
	 * singleton producer.
	 * @return singleton instance of RuleManager
	 */
	public static RuleManager getInstance() {
		if(RuleManager.INSTANCE == null)
			RuleManager.INSTANCE = new RuleManager(REPORTFORMAT, RESOURCEDIR);
		
		return RuleManager.INSTANCE;
	}
	
	
	/**
	 * READ THE RULES FROM THE FILES. The files have to be defined in the HashMap hmResourcesRules.
	 * @param hmResourcesRules rules to be interpreted
	 */
	public void readRules(HashMap<String, String> hmResourcesRules) {
		try {
			for (String resource : hmResourcesRules.keySet()) {
				Logger.printDetail(component, "Adding rule resource: "+resource);
				Scanner sc = new Scanner(new File(hmResourcesRules.get(resource)));
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					if (!(line.startsWith("//"))) {
						boolean correctLine = false;
						if (!(line.equals(""))) {
							Logger.printDetail("DEBUGGING: reading rules..."+ line);
							// check each line for the name, extraction, and normalization part
							for (MatchResult r : Toolbox.findMatches(paReadRules, line)) {
								correctLine = true;
								String rule_name          = r.group(1);
								String rule_extraction    = r.group(2);
								String rule_normalization = r.group(3);
								
								
								String rule_offset        = "";
								String rule_quant         = "";
								String rule_freq          = "";
								String rule_mod           = "";
								String pos_constraint     = "";
								
								////////////////////////////////////////////////////////////////////
								// RULE EXTRACTION PARTS ARE TRANSLATED INTO REGULAR EXPRESSSIONS //
								////////////////////////////////////////////////////////////////////
								// create pattern for rule extraction part
								Pattern paVariable = Pattern.compile("%(re[a-zA-Z0-9]*)");
								RePatternManager rpm = RePatternManager.getInstance();
								for (MatchResult mr : Toolbox.findMatches(paVariable,rule_extraction)) {
									Logger.printDetail("DEBUGGING: replacing patterns..."+ mr.group());
									if (!(rpm.containsKey(mr.group(1)))) {
										Logger.printError("Error creating rule:"+rule_name);
										Logger.printError("The following pattern used in this rule does not exist, does it? %"+mr.group(1));
										System.exit(-1);
									}
									rule_extraction = rule_extraction.replaceAll("%"+mr.group(1), rpm.get(mr.group(1)));
								}
								rule_extraction = rule_extraction.replaceAll(" ", "[\\\\s]+");
								Pattern pattern = null;
								try{
									pattern = Pattern.compile(rule_extraction);
								}
								catch (java.util.regex.PatternSyntaxException e) {
										Logger.printError("Compiling rules resulted in errors.");
										Logger.printError("Problematic rule is "+rule_name);
										Logger.printError("Cannot compile pattern: "+rule_extraction);
										e.printStackTrace();
										System.exit(-1);
									}
//								Pattern pattern = Pattern.compile(rule_extraction);
																
								/////////////////////////////////////
								// CHECK FOR ADDITIONAL CONSTRAINS //
								/////////////////////////////////////
								if (!(r.group(4) == null)) {
									if (r.group(4).contains("OFFSET")) {
										Pattern paOffset = Pattern.compile("OFFSET=\"(.*?)\"");
										for (MatchResult ro : Toolbox.findMatches(paOffset, line)) {
											rule_offset = ro.group(1);
										}
									}
									if (r.group(4).contains("NORM_QUANT")) {
										Pattern paQuant = Pattern.compile("NORM_QUANT=\"(.*?)\"");
										for (MatchResult rq : Toolbox.findMatches(paQuant, line)) {
											rule_quant = rq.group(1);
										}
									}
									if (r.group(4).contains("NORM_FREQ")) {
										Pattern paFreq = Pattern.compile("NORM_FREQ=\"(.*?)\"");
										for (MatchResult rf : Toolbox.findMatches(paFreq, line)) {
											rule_freq = rf.group(1);
										}
									}
									if (r.group(4).contains("NORM_MOD")) {
										Pattern paMod = Pattern.compile("NORM_MOD=\"(.*?)\"");
										for (MatchResult rf : Toolbox.findMatches(paMod, line)) {
											rule_mod = rf.group(1);
										}
									}
									if (r.group(4).contains("POS_CONSTRAINT")) {
										Pattern paPos = Pattern.compile("POS_CONSTRAINT=\"(.*?)\"");
										for (MatchResult rp : Toolbox.findMatches(paPos, line)) {
											pos_constraint = rp.group(1);
										}
									}
								}

								/////////////////////////////////////////////
								// READ DATE RULES AND MAKE THEM AVAILABLE //
								/////////////////////////////////////////////
								if (resource.equals("daterules")) {
									// get extraction part
									hmDatePattern.put(pattern, rule_name);
									// get normalization part
									hmDateNormalization.put(rule_name, rule_normalization);
									// get offset part
									if (!(rule_offset.equals(""))) {
										hmDateOffset.put(rule_name, rule_offset);										
									}
									// get quant part
									if (!(rule_quant.equals(""))) {
										hmDateQuant.put(rule_name, rule_quant);
									}
									// get freq part
									if (!(rule_freq.equals(""))) {
										hmDateFreq.put(rule_name, rule_freq);
									}
									// get mod part
									if (!(rule_mod.equals(""))) {
										hmDateMod.put(rule_name, rule_mod);
									}
									// get pos constraint part
									if (!(pos_constraint.equals(""))) {
										hmDatePosConstraint.put(rule_name, pos_constraint);
									}
								}
								
								/////////////////////////////////////////////////
								// READ DURATION RULES AND MAKE THEM AVAILABLE //
								/////////////////////////////////////////////////
								else if (resource.equals("durationrules")) {
									// get extraction part
									hmDurationPattern.put(pattern, rule_name);
									// get normalization part
									hmDurationNormalization.put(rule_name, rule_normalization);
									// get offset part									
									if (!(rule_offset.equals(""))) {
										hmDurationOffset.put(rule_name, rule_offset);										
									}
									// get quant part
									if (!(rule_quant.equals(""))) {
										hmDurationQuant.put(rule_name, rule_quant);
									}
									// get freq part
									if (!(rule_freq.equals(""))) {
										hmDurationFreq.put(rule_name, rule_freq);
									}
									// get mod part
									if (!(rule_mod.equals(""))) {
										hmDurationMod.put(rule_name, rule_mod);
									}
									// get pos constraint part
									if (!(pos_constraint.equals(""))) {
										hmDurationPosConstraint.put(rule_name, pos_constraint);
									}
								}
								
								////////////////////////////////////////////
								// READ SET RULES AND MAKE THEM AVAILABLE //
								////////////////////////////////////////////
								else if (resource.equals("setrules")) {
									// get extraction part
									hmSetPattern.put(pattern, rule_name);
									// get normalization part
									hmSetNormalization.put(rule_name, rule_normalization);
									// get offset part									
									if (!rule_offset.equals("")) {
										hmSetOffset.put(rule_name, rule_offset);										
									}
									// get quant part
									if (!rule_quant.equals("")) {
										hmSetQuant.put(rule_name, rule_quant);
									}
									// get freq part
									if (!rule_freq.equals("")) {
										hmSetFreq.put(rule_name, rule_freq);
									}
									// get mod part
									if (!rule_mod.equals("")) {
										hmSetMod.put(rule_name, rule_mod);
									}
									// get pos constraint part
									if (!pos_constraint.equals("")) {
										hmSetPosConstraint.put(rule_name, pos_constraint);
									}
								}
								
								/////////////////////////////////////////////
								// READ TIME RULES AND MAKE THEM AVAILABLE //
								/////////////////////////////////////////////
								else if (resource.equals("timerules")) {
									// get extraction part
									hmTimePattern.put(pattern, rule_name);
									// get normalization part
									hmTimeNormalization.put(rule_name, rule_normalization);
									// get offset part									
									if (!rule_offset.equals("")) {
										hmTimeOffset.put(rule_name, rule_offset);										
									}
									// get quant part
									if (!rule_quant.equals("")) {
										hmTimeQuant.put(rule_name, rule_quant);
									}
									// get freq part
									if (!rule_freq.equals("")) {
										hmTimeFreq.put(rule_name, rule_freq);
									}
									// get mod part
									if (!rule_mod.equals("")) {
										hmTimeMod.put(rule_name, rule_mod);
									}
									// get pos constraint part
									if (!pos_constraint.equals("")) {
										hmTimePosConstraint.put(rule_name, pos_constraint);
									}
								}
								else {
									Logger.printError(component, "something wrong when reading rule resource: "+resource);
								}
							}
						}
						
						///////////////////////////////////////////
						// CHECK FOR PROBLEMS WHEN READING RULES //
						///////////////////////////////////////////
						if ((correctLine == false) && (!(line.matches("")))) {
							Logger.printError(component, "Cannot read the following line of rule resource "+resource);
							Logger.printError(component, "Line: "+line);
						}
					}
				}
				sc.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public final HashMap<Pattern, String> getHmDatePattern() {
		return hmDatePattern;
	}

	public final HashMap<Pattern, String> getHmDurationPattern() {
		return hmDurationPattern;
	}

	public final HashMap<Pattern, String> getHmTimePattern() {
		return hmTimePattern;
	}

	public final HashMap<Pattern, String> getHmSetPattern() {
		return hmSetPattern;
	}

	public final HashMap<String, String> getHmDateNormalization() {
		return hmDateNormalization;
	}

	public final HashMap<String, String> getHmTimeNormalization() {
		return hmTimeNormalization;
	}

	public final HashMap<String, String> getHmDurationNormalization() {
		return hmDurationNormalization;
	}

	public final HashMap<String, String> getHmSetNormalization() {
		return hmSetNormalization;
	}

	public final HashMap<String, String> getHmDateOffset() {
		return hmDateOffset;
	}

	public final HashMap<String, String> getHmTimeOffset() {
		return hmTimeOffset;
	}

	public final HashMap<String, String> getHmDurationOffset() {
		return hmDurationOffset;
	}

	public final HashMap<String, String> getHmSetOffset() {
		return hmSetOffset;
	}

	public final HashMap<String, String> getHmDateQuant() {
		return hmDateQuant;
	}

	public final HashMap<String, String> getHmTimeQuant() {
		return hmTimeQuant;
	}

	public final HashMap<String, String> getHmDurationQuant() {
		return hmDurationQuant;
	}

	public final HashMap<String, String> getHmSetQuant() {
		return hmSetQuant;
	}

	public final HashMap<String, String> getHmDateFreq() {
		return hmDateFreq;
	}

	public final HashMap<String, String> getHmTimeFreq() {
		return hmTimeFreq;
	}

	public final HashMap<String, String> getHmDurationFreq() {
		return hmDurationFreq;
	}

	public final HashMap<String, String> getHmSetFreq() {
		return hmSetFreq;
	}

	public final HashMap<String, String> getHmDateMod() {
		return hmDateMod;
	}

	public final HashMap<String, String> getHmTimeMod() {
		return hmTimeMod;
	}

	public final HashMap<String, String> getHmDurationMod() {
		return hmDurationMod;
	}

	public final HashMap<String, String> getHmSetMod() {
		return hmSetMod;
	}

	public final HashMap<String, String> getHmDatePosConstraint() {
		return hmDatePosConstraint;
	}

	public final HashMap<String, String> getHmTimePosConstraint() {
		return hmTimePosConstraint;
	}

	public final HashMap<String, String> getHmDurationPosConstraint() {
		return hmDurationPosConstraint;
	}

	public final HashMap<String, String> getHmSetPosConstraint() {
		return hmSetPosConstraint;
	}

}
