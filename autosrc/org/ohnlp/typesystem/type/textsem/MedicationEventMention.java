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
package org.ohnlp.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.ohnlp.typesystem.type.refsem.MedicationDosage;
import org.ohnlp.typesystem.type.refsem.MedicationRoute;
import org.ohnlp.typesystem.type.refsem.MedicationDuration;
import org.ohnlp.typesystem.type.refsem.MedicationFrequency;
import org.ohnlp.typesystem.type.refsem.Date;
import org.ohnlp.typesystem.type.refsem.MedicationStrength;
import org.ohnlp.typesystem.type.refsem.MedicationForm;
import org.ohnlp.typesystem.type.refsem.MedicationStatusChange;


/** A text string (EventMention and therefore IdentifiedAnnotation) that refers to a (Medication) Event.
 * Updated by JCasGen Thu Jan 05 15:24:54 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class MedicationEventMention extends EventMention {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MedicationEventMention.class);
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
  protected MedicationEventMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MedicationEventMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MedicationEventMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MedicationEventMention(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: medicationFrequency

  /** getter for medicationFrequency - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationFrequency getMedicationFrequency() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (MedicationFrequency)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationFrequency)));}
    
  /** setter for medicationFrequency - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationFrequency(MedicationFrequency v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationFrequency, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDuration

  /** getter for medicationDuration - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDuration getMedicationDuration() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (MedicationDuration)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDuration)));}
    
  /** setter for medicationDuration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDuration(MedicationDuration v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDuration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationRoute

  /** getter for medicationRoute - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationRoute getMedicationRoute() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (MedicationRoute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationRoute)));}
    
  /** setter for medicationRoute - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationRoute(MedicationRoute v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationRoute, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStatusChange

  /** getter for medicationStatusChange - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStatusChange getMedicationStatusChange() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (MedicationStatusChange)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStatusChange)));}
    
  /** setter for medicationStatusChange - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStatusChange(MedicationStatusChange v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStatusChange, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDosage

  /** getter for medicationDosage - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDosage getMedicationDosage() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (MedicationDosage)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDosage)));}
    
  /** setter for medicationDosage - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDosage(MedicationDosage v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDosage, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStrength

  /** getter for medicationStrength - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStrength getMedicationStrength() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (MedicationStrength)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStrength)));}
    
  /** setter for medicationStrength - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStrength(MedicationStrength v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStrength, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationForm

  /** getter for medicationForm - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationForm getMedicationForm() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (MedicationForm)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationForm)));}
    
  /** setter for medicationForm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationForm(MedicationForm v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationForm, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: startDate

  /** getter for startDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getStartDate() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_startDate)));}
    
  /** setter for startDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartDate(Date v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_startDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endDate

  /** getter for endDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getEndDate() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_endDate)));}
    
  /** setter for endDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndDate(Date v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.ohnlp.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_endDate, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    