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
package org.ohnlp.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A set of mostly temporal properties that are unique to Events.
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class EventProperties extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EventProperties.class);
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
  protected EventProperties() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EventProperties(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EventProperties(JCas jcas) {
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
  //* Feature: contextualModality

  /** getter for contextualModality - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextualModality() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualModality == null)
      jcasType.jcas.throwFeatMissing("contextualModality", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualModality);}
    
  /** setter for contextualModality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextualModality(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualModality == null)
      jcasType.jcas.throwFeatMissing("contextualModality", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualModality, v);}    
   
    
  //*--------------*
  //* Feature: contextualAspect

  /** getter for contextualAspect - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextualAspect() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualAspect == null)
      jcasType.jcas.throwFeatMissing("contextualAspect", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualAspect);}
    
  /** setter for contextualAspect - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextualAspect(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualAspect == null)
      jcasType.jcas.throwFeatMissing("contextualAspect", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualAspect, v);}    
   
    
  //*--------------*
  //* Feature: permanence

  /** getter for permanence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPermanence() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_permanence == null)
      jcasType.jcas.throwFeatMissing("permanence", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_permanence);}
    
  /** setter for permanence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPermanence(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_permanence == null)
      jcasType.jcas.throwFeatMissing("permanence", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_permanence, v);}    
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets Type of Event.
   * @generated
   * @return value of the feature 
   */
  public String getCategory() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets Type of Event. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategory(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_category, v);}    
   
    
  //*--------------*
  //* Feature: aspect

  /** getter for aspect - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAspect() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_aspect);}
    
  /** setter for aspect - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAspect(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_aspect, v);}    
   
    
  //*--------------*
  //* Feature: docTimeRel

  /** getter for docTimeRel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocTimeRel() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_docTimeRel == null)
      jcasType.jcas.throwFeatMissing("docTimeRel", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_docTimeRel);}
    
  /** setter for docTimeRel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocTimeRel(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_docTimeRel == null)
      jcasType.jcas.throwFeatMissing("docTimeRel", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_docTimeRel, v);}    
   
    
  //*--------------*
  //* Feature: degree

  /** getter for degree - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDegree() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_degree == null)
      jcasType.jcas.throwFeatMissing("degree", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_degree);}
    
  /** setter for degree - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDegree(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_degree == null)
      jcasType.jcas.throwFeatMissing("degree", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_degree, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPolarity() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.ohnlp.typesystem.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EventProperties_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(int v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.ohnlp.typesystem.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setIntValue(addr, ((EventProperties_Type)jcasType).casFeatCode_polarity, v);}    
  }

    