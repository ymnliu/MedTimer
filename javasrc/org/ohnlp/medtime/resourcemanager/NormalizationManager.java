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

import org.ohnlp.medtime.util.*;
/**
 * 
 * This class fills the role of a manager of all the Normalization resources.
 * It reads the data from a file system and fills up a bunch of HashMaps
 * with their information.
 * @author Mayo NLP
 *
 */
public class NormalizationManager extends GenericResourceManager {
	private static NormalizationManager INSTANCE = null;
		// PATTERNS TO READ RESOURCES "RULES" AND "NORMALIZATION"
	private Pattern paReadNormalizations = Pattern.compile("\"(.*?)\",\"(.*?)\"");

	// STORE PATTERNS AND NORMALIZATIONS
	private HashMap<String, HashMap<String,String>> hmAllNormalization;
	
	// ACCESS TO SOME NORMALIZATION MAPPINGS (set internally)
	private HashMap<String, String> normDayInWeek;
	private HashMap<String, String> normNumber;
	private HashMap<String, String> normMonthName;
	private HashMap<String, String> normMonthInSeason; 
	private HashMap<String, String> normMonthInQuarter;

	/**
	 * Constructor calls the parent constructor that sets language/resource parameters,
	 * initializes basic and collects resource normalization patterns.
	 * @param language
	 */
	private NormalizationManager(String language, String resourceDir) {
		// calls the Generic constructor with normalization-parameter
		super("normalization");
		// initialize the data structures
		hmAllNormalization = new HashMap<String, HashMap<String,String>>();
		
		normNumber = new HashMap<String, String>();
		normDayInWeek = new HashMap<String, String>();
		normMonthName = new HashMap<String, String>();
		normMonthInSeason = new HashMap<String, String>();
		normMonthInQuarter = new HashMap<String, String>();
		
		// GLOBAL NORMALIZATION INFORMATION
		readGlobalNormalizationInformation();
		
		////////////////////////////////////////////////////////////
		// READ NORMALIZATION RESOURCES FROM FILES AND STORE THEM //
		////////////////////////////////////////////////////////////
		HashMap<String, String> hmResourcesNormalization = readResourcesFromDirectory();
		
		for (String which : hmResourcesNormalization.keySet()) {
			hmAllNormalization.put(which, new HashMap<String, String>());
		}
		
		readNormalizationResources(hmResourcesNormalization);
	}

	/**
	 * singleton producer.
	 * @return singleton instance of NormalizationManager
	 */
	public static NormalizationManager getInstance() {
		if(NormalizationManager.INSTANCE == null)
			NormalizationManager.INSTANCE = new NormalizationManager(REPORTFORMAT, RESOURCEDIR);
		
		return NormalizationManager.INSTANCE;
	}
	
	/**
	 * Read the resources (of any language) from resource files and 
	 * fill the HashMaps used for normalization tasks.
	 * @param hmResourcesNormalization normalization patterns to be interpreted
	 */
	public void readNormalizationResources(HashMap<String, String> hmResourcesNormalization) {
		try {
			for (String resource : hmResourcesNormalization.keySet()) {
				Logger.printDetail(component, "Adding normalization resource: "+resource);
				System.out.println(resource);
				// create a buffered reader for every normalization resource file
				Scanner sc = new Scanner(new File(hmResourcesNormalization.get(resource)));
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					if (!(line.startsWith("//"))) {
						boolean correctLine = false;
						// check each line for the normalization format (defined in paReadNormalizations)
						for (Object r : Toolbox.findMatches(paReadNormalizations, line)) {
							MatchResult mr = (MatchResult) r;
							correctLine = true;
							String resource_word   = mr.group(1);
							String normalized_word = mr.group(2);
							for (String which : hmAllNormalization.keySet()) {
								if (resource.equals(which)) {
									hmAllNormalization.get(which).put(resource_word,normalized_word);
								}
							}
							if ((correctLine == false) && (!(line.matches("")))) {
								Logger.printError("["+component+"] Cannot read one of the lines of normalization resource "+resource);
								Logger.printError("["+component+"] Line: "+line);
							}
						}
					}
				}
				sc.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * sets a couple of rudimentary normalization parameters
	 */
	private void readGlobalNormalizationInformation() {

		// MONTH IN QUARTER
		normMonthInQuarter.put("01","1");
		normMonthInQuarter.put("02","1");
		normMonthInQuarter.put("03","1");
		normMonthInQuarter.put("04","2");
		normMonthInQuarter.put("05","2");
		normMonthInQuarter.put("06","2");
		normMonthInQuarter.put("07","3");
		normMonthInQuarter.put("08","3");
		normMonthInQuarter.put("09","3");
		normMonthInQuarter.put("10","4");
		normMonthInQuarter.put("11","4");
		normMonthInQuarter.put("12","4");
		
		// MONTH IN SEASON
		normMonthInSeason.put("", "");
		normMonthInSeason.put("01","WI");
		normMonthInSeason.put("02","WI");
		normMonthInSeason.put("03","SP");
		normMonthInSeason.put("04","SP");
		normMonthInSeason.put("05","SP");
		normMonthInSeason.put("06","SU");
		normMonthInSeason.put("07","SU");
		normMonthInSeason.put("08","SU");
		normMonthInSeason.put("09","FA");
		normMonthInSeason.put("10","FA");
		normMonthInSeason.put("11","FA");
		normMonthInSeason.put("12","WI");
		
		// DAY IN WEEK
		normDayInWeek.put("sunday","1");
		normDayInWeek.put("monday","2");
		normDayInWeek.put("tuesday","3");
		normDayInWeek.put("wednesday","4");
		normDayInWeek.put("thursday","5");
		normDayInWeek.put("friday","6");
		normDayInWeek.put("saturday","7");
		normDayInWeek.put("Sunday","1");
		normDayInWeek.put("Monday","2");
		normDayInWeek.put("Tuesday","3");
		normDayInWeek.put("Wednesday","4");
		normDayInWeek.put("Thursday","5");
		normDayInWeek.put("Friday","6");
		normDayInWeek.put("Saturday","7");
		
		// NORM MINUTE
		normNumber.put("0","00");
		normNumber.put("00","00");
		normNumber.put("1","01");
		normNumber.put("01","01");
		normNumber.put("2","02");
		normNumber.put("02","02");
		normNumber.put("3","03");
		normNumber.put("03","03");
		normNumber.put("4","04");
		normNumber.put("04","04");
		normNumber.put("5","05");
		normNumber.put("05","05");
		normNumber.put("6","06");
		normNumber.put("06","06");
		normNumber.put("7","07");
		normNumber.put("07","07");
		normNumber.put("8","08");
		normNumber.put("08","08");
		normNumber.put("9","09");
		normNumber.put("09","09");
		normNumber.put("10","10");
		normNumber.put("11","11");
		normNumber.put("12","12");
		normNumber.put("13","13");
		normNumber.put("14","14");
		normNumber.put("15","15");
		normNumber.put("16","16");
		normNumber.put("17","17");
		normNumber.put("18","18");
		normNumber.put("19","19");
		normNumber.put("20","20");
		normNumber.put("21","21");
		normNumber.put("22","22");
		normNumber.put("23","23");
		normNumber.put("24","24");
		normNumber.put("25","25");
		normNumber.put("26","26");
		normNumber.put("27","27");
		normNumber.put("28","28");
		normNumber.put("29","29");
		normNumber.put("30","30");
		normNumber.put("31","31");
		normNumber.put("32","32");
		normNumber.put("33","33");
		normNumber.put("34","34");
		normNumber.put("35","35");
		normNumber.put("36","36");
		normNumber.put("37","37");
		normNumber.put("38","38");
		normNumber.put("39","39");
		normNumber.put("40","40");
		normNumber.put("41","41");
		normNumber.put("42","42");
		normNumber.put("43","43");
		normNumber.put("44","44");
		normNumber.put("45","45");
		normNumber.put("46","46");
		normNumber.put("47","47");
		normNumber.put("48","48");
		normNumber.put("49","49");
		normNumber.put("50","50");
		normNumber.put("51","51");
		normNumber.put("52","52");
		normNumber.put("53","53");
		normNumber.put("54","54");
		normNumber.put("55","55");
		normNumber.put("56","56");
		normNumber.put("57","57");
		normNumber.put("58","58");
		normNumber.put("59","59");
		normNumber.put("60","60");
		
		// NORM MONTH
		normMonthName.put("january","01");
		normMonthName.put("february","02");
		normMonthName.put("march","03");
		normMonthName.put("april","04");
		normMonthName.put("may","05");
		normMonthName.put("june","06");
		normMonthName.put("july","07");
		normMonthName.put("august","08");
		normMonthName.put("september","09");
		normMonthName.put("october","10");
		normMonthName.put("november","11");
		normMonthName.put("december","12");
	}
	/*
	 * a bunch of getter methods to facilitate access to the data structures
	 */
	public final HashMap<String, String> getFromHmAllNormalization(String key) {
		return hmAllNormalization.get(key);
	}

	public final String getFromNormNumber(String key) {
		return normNumber.get(key);
	}

	public final String getFromNormDayInWeek(String key) {
		return normDayInWeek.get(key);
	}

	public final String getFromNormMonthName(String key) {
		return normMonthName.get(key);
	}

	public final String getFromNormMonthInSeason(String key) {
		return normMonthInSeason.get(key);
	}

	public final String getFromNormMonthInQuarter(String key) {
		return normMonthInQuarter.get(key);
	}
}
