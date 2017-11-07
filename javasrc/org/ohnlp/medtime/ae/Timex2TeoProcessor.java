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

package org.ohnlp.medtime.ae;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.ohnlp.medtime.type.Duration;
import org.ohnlp.medtime.type.MedTimex3;
import org.ohnlp.medtime.type.TimeInstant;
import org.ohnlp.medtime.type.TimeInterval;
import org.ohnlp.medtime.type.TimePhase;

/**
 * A translator from MedTimex3 to TEO. Should be placed as the last processors, after 
 * removing all the replications.  
 * 
 * @author Sijia Liu
 *
 */

public class Timex2TeoProcessor extends GenericProcessor {

	static Pattern durationPtn = Pattern.compile("(\\D+)(\\d+)(\\D)");
	
	@Override
	public void process(JCas jcas) {
		translateTimex2Teo(jcas);
	}

	
	private void translateTimex2Teo(JCas jcas){
		// build up a list with all found TIMEX expressions
		List<MedTimex3> linearDates = new ArrayList<MedTimex3>();
		List<MedTimex3> linearDurations = new ArrayList<MedTimex3>();
		List<MedTimex3> linearSets = new ArrayList<MedTimex3>();

		FSIterator<? extends Annotation> iterTimex = jcas.getAnnotationIndex(MedTimex3.type).iterator();

		// Create List of all Timexes of types "date" and "time"
		while (iterTimex.hasNext()) {
			MedTimex3 timex = (MedTimex3) iterTimex.next();
			if ((timex.getTimexType().equals("DATE")) || (timex.getTimexType().equals("TIME"))) {
				linearDates.add(timex);
			}
			if(timex.getTimexType().equals("DURATION")){
				linearDurations.add(timex);
			}
			if(timex.getTimexType().equals("SET")){
				linearSets.add(timex);
			}
		}
		
		for(MedTimex3 mt : linearDates){
			TimeInstant ti = timex2TimeInstant(jcas, mt);
			ti.addToIndexes();
		}
		
		for(MedTimex3 mt: linearDurations){
			Duration du = timex2Duration(jcas, mt);
			du.addToIndexes();
		}
		
		for(MedTimex3 mt: linearSets){
			TimeInterval tp = timex2TimeInterval(jcas, mt);
			tp.addToIndexes();
		}
	}
	
	private TimeInstant timex2TimeInstant(JCas jcas, MedTimex3 timex){
		
		TimeInstant ti = new TimeInstant(jcas);
		ti.setBegin(timex.getBegin());
		ti.setEnd(timex.getEnd());
		ti.setFoundByRule(timex.getFoundByRule());
		if(timex.getTimexValue() != null){		
			ti.setTimexValue(timex.getTimexValue());
			ti.setOriginTime(timex.getTimexValue());
			ti.setHasNormalizedTime(true);
			ti.setHasOriginTime(true);
		}
		
		
		if(timex.getTimexType().equals("DATE")){
			ti.setGranularity("day");
			ti.setHasGranularity(true);
		}

		if(timex.getTimexType().equals("TIME")){
			ti.setGranularity("minute");
			ti.setHasGranularity(true);
		}
		
		ti.setHasApproximation(true);		// true as default.
		
		return ti;
	}
	
	private Duration timex2Duration(JCas jcas, MedTimex3 timex){
		Duration du = new Duration(jcas);
		du.setBegin(timex.getBegin());
		du.setEnd(timex.getEnd());
		du.setFoundByRule(timex.getFoundByRule());
		// pattern XXdX
		String[] propertyStrs = parseTimexValue(timex.getTimexValue());
				
		if(propertyStrs[1] != null && propertyStrs[1].length() != 0){
			du.setDurationValue(Double.parseDouble(propertyStrs[1]));
		}
		
		if(propertyStrs[2] != null && propertyStrs[2].length() != 0){
			du.setDurationUnit(propertyStrs[2]);
			du.setHasDurationUnit(true);
		}
		else{
			du.setHasDurationUnit(false);
		}
		
		du.setHasOriginForm(true);
		
		return du;
	}
	
	private TimePhase timex2TimePhase(JCas jcas, MedTimex3 timex){
		TimePhase tp = new TimePhase(jcas);
		tp.setBegin(timex.getBegin());
		tp.setEnd(timex.getEnd());
		tp.setFoundByRule(timex.getFoundByRule());
		
		String[] propertyStrs = parseTimexValue(timex.getTimexValue());

		Duration du = new Duration(jcas);
		du.setDurationUnit(propertyStrs[2]);
		if(propertyStrs[1] != null && propertyStrs[1].length() != 0){
			du.setDurationValue(Double.parseDouble(propertyStrs[1]));
		}
		
		if(propertyStrs[2] != null && propertyStrs[2].length() != 0){
			du.setDurationUnit(propertyStrs[2]);
			du.setHasDurationUnit(true);
		}
		else{
			du.setHasDurationUnit(false);
		}
		du.addToIndexes();
		tp.setEndDuration(du);
		
		return tp;
	}
	
	private TimeInterval timex2TimeInterval(JCas jcas, MedTimex3 timex){
		TimeInterval tInterval = new TimeInterval(jcas, timex.getBegin(), timex.getEnd());
		tInterval.setFoundByRule(timex.getFoundByRule());
//		String[] propertyStrs = parseTimexValue(timex.getTimexValue());
//
//		Duration du = new Duration(jcas);
//		du.setDurationUnit(timex.getTimexQuant());
//			du.setDurationValue(Double.parseDouble(timex.getTimexFreq()));		
//		
//		du.addToIndexes();
//		tInterval.setEndDuration(du);

		return tInterval;
	}

	
	/**
	 * Parse Timex value to three parts: {type, value, unit}
	 * 
	 * @param timexValue
	 * 		e.g. 	"PT5Y"
	 * 				"RPT0.5W"
	 * @return String array of {type, value, unit}
	 */
	private static String[] parseTimexValue(String timexValue){
		Matcher m = durationPtn.matcher(timexValue);
		String timexType = "", timexValueStr = "", timexUnitCode = "", teoUnit = ""; 
		if (m.find( )) {
			
			// TODO: need to know what the first one or two letters represent
			timexType	=  m.group(1);
			
			// determine value
			timexValueStr = m.group(2);

			// determine unit
			timexUnitCode = m.group(3);
			switch(timexUnitCode){
			case "Y":	
				teoUnit = "year"; break;
			case "D":
				teoUnit = "day"; break;
			case "H":
				teoUnit = "hour"; break;
			case "M":
				teoUnit = "month"; break;
			case "W":
				teoUnit = "week"; break;
			}
			
		} else {
			System.out.println("Duration string \"" + timexValue + "\" does not match any TEO patterns.");
		}
		String[] returnStrings = {timexType, timexValueStr, teoUnit};
		return returnStrings;
	}
}
