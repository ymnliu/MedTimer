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


/* First created by JCasGen Sun Sep 29 06:04:08 CDT 2013 */
package org.ohnlp.typesystem.type.structured;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.LongArray;
import org.apache.uima.jcas.cas.TOP;


/** Structured data that captures information about the document, patient, or context of the clinical text.
 * Updated by JCasGen Thu Jan 05 15:24:53 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class Metadata extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Metadata.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Metadata() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Metadata(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Metadata(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: patientID

  /** getter for patientID - gets 
   * @generated
   * @return value of the feature 
   */
  public long getPatientID() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_patientID == null)
      jcasType.jcas.throwFeatMissing("patientID", "org.ohnlp.typesystem.type.structured.Metadata");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Metadata_Type)jcasType).casFeatCode_patientID);}
    
  /** setter for patientID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPatientID(long v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_patientID == null)
      jcasType.jcas.throwFeatMissing("patientID", "org.ohnlp.typesystem.type.structured.Metadata");
    jcasType.ll_cas.ll_setLongValue(addr, ((Metadata_Type)jcasType).casFeatCode_patientID, v);}    
   
    
  //*--------------*
  //* Feature: providerID

  /** getter for providerID - gets 
   * @generated
   * @return value of the feature 
   */
  public LongArray getProviderID() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_providerID == null)
      jcasType.jcas.throwFeatMissing("providerID", "org.ohnlp.typesystem.type.structured.Metadata");
    return (LongArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_providerID)));}
    
  /** setter for providerID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProviderID(LongArray v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_providerID == null)
      jcasType.jcas.throwFeatMissing("providerID", "org.ohnlp.typesystem.type.structured.Metadata");
    jcasType.ll_cas.ll_setRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_providerID, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for providerID - gets an indexed value - 
   * @generated */
  public long getProviderID(int i) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_providerID == null)
      jcasType.jcas.throwFeatMissing("providerID", "org.ohnlp.typesystem.type.structured.Metadata");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_providerID), i);
    return jcasType.ll_cas.ll_getLongArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_providerID), i);}

  /** indexed setter for providerID - sets an indexed value - 
   * @generated */
  public void setProviderID(int i, long v) { 
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_providerID == null)
      jcasType.jcas.throwFeatMissing("providerID", "org.ohnlp.typesystem.type.structured.Metadata");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_providerID), i);
    jcasType.ll_cas.ll_setLongArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_providerID), i, v);}
   
    
  //*--------------*
  //* Feature: sourceData

  /** getter for sourceData - gets 
   * @generated
   * @return value of the feature 
   */
  public SourceData getSourceData() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_sourceData == null)
      jcasType.jcas.throwFeatMissing("sourceData", "org.ohnlp.typesystem.type.structured.Metadata");
    return (SourceData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_sourceData)));}
    
  /** setter for sourceData - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceData(SourceData v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_sourceData == null)
      jcasType.jcas.throwFeatMissing("sourceData", "org.ohnlp.typesystem.type.structured.Metadata");
    jcasType.ll_cas.ll_setRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_sourceData, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: demographics

  /** getter for demographics - gets 
   * @generated
   * @return value of the feature 
   */
  public Demographics getDemographics() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_demographics == null)
      jcasType.jcas.throwFeatMissing("demographics", "org.ohnlp.typesystem.type.structured.Metadata");
    return (Demographics)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_demographics)));}
    
  /** setter for demographics - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDemographics(Demographics v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_demographics == null)
      jcasType.jcas.throwFeatMissing("demographics", "org.ohnlp.typesystem.type.structured.Metadata");
    jcasType.ll_cas.ll_setRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_demographics, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    