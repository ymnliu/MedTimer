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
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *   
 *  http://www.apache.org/licenses/LICENSE-2.0 
 *   
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and 
 *  limitations under the License. 
 *******************************************************************************/
package org.ohnlp.medtime.cc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;
import org.apache.uima.util.ProcessTrace;
import org.ohnlp.medtime.type.DocumentMetadata;
import org.ohnlp.medtime.type.LabValueMention;
import org.ohnlp.typesystem.type.structured.Demographics;
import org.ohnlp.typesystem.type.structured.Metadata;
import org.ohnlp.typesystem.type.textspan.Sentence;

/**
 * Generate Trec output format
 * @author Sijia Liu
 * Modified from /MedTagger/javasrc/org/ohnlp/medtagger/cc/TabDelimitedWriter.java
 */
public class LabLinkerWriter extends CasConsumer_ImplBase {

	public static final String PARAM_OUTPUTDIR = "OutputPath";

	private File mOutputDir;
	private File mOutputFilePath;


	private int mDocNum;

	private boolean printDetails = false;

	private Logger logger = Logger.getLogger(getClass().getName());

	private BufferedWriter iv_bw = null;

	private String docDateStr = "DOC_DATE";
	private String mcnStr = "MCN";
	/**
	 * initialize
	 */
	public void initialize() throws ResourceInitializationException {

		mDocNum = 0;
		//		mOutputDir = new File((String) getConfigParameterValue(PARAM_OUTPUTDIR));
		//		if (!mOutputDir.exists()) {
		//			mOutputDir.mkdirs();
		//		} 
		mOutputFilePath = new File((String) getConfigParameterValue(PARAM_OUTPUTDIR));

		try {
			iv_bw = new BufferedWriter(new FileWriter(mOutputFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	/**
	 * process
	 */
	public void processCas(CAS aCAS) throws ResourceProcessException {

		JCas jcas;
		try {
			// TODO: add UIMA views
			//jcas = aCAS.getJCas().getView("plaintext");
			jcas = aCAS.getJCas();
			FSIterator<TOP> metaIter = jcas.getJFSIndexRepository().getAllIndexedFS(Demographics.type);

			if(metaIter.hasNext()){
				Demographics meta = (Demographics) metaIter.next();
				docDateStr = meta.getBirthDate();
				mcnStr = meta.getFirstName();
			}

			printAnnotationsInline(jcas);

		} catch (CASException e) {
			e.printStackTrace();
			throw new ResourceProcessException(e);
		}
	}


	@SuppressWarnings("unchecked")

	// print out match and concept mention

	public void printAnnotationsInline(JCas jcas){

		//		AnnotationIndex<?> lineSentIndex = jcas.getAnnotationIndex(Sentence.type);
		//		Iterator<?> sentItr = lineSentIndex.iterator();
		AnnotationIndex<?> labValueIdx = jcas.getAnnotationIndex(LabValueMention.type);
		Iterator<?> labItr = labValueIdx.iterator();
		BufferedWriter bw = iv_bw;

		try {
			int sentId = 0;
			while(labItr.hasNext()){
				LabValueMention lv = (LabValueMention) labItr.next();
				bw.write(sentId + "|" + docDateStr + "|" + mcnStr + "|" + labValue2String(lv) + '\n');

			}
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error("error in writing drugs...");
			e.printStackTrace();
		}
	}

	public void collectionProcessComplete(ProcessTrace arg0) throws ResourceProcessException, IOException{
		iv_bw.close();
	}

	String labValue2String(LabValueMention lv){
		if(lv.getLabTestName().isEmpty()){
			return "";
		}

		if(lv.getTime() == null){
			return lv.getLabTestName() + "|" + lv.getLabTestValue() + "|" + docDateStr;
		}
		return  lv.getLabTestName() + "|" + lv.getLabTestValue() + "|" + lv.getTime().getTimexValue();
	}
}
