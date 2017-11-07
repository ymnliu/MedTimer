

/* First created by JCasGen Mon Apr 04 14:55:54 CDT 2016 */
package org.ohnlp.medtime.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.ohnlp.typesystem.type.refsem.Date;


import org.apache.uima.jcas.tcas.Annotation;


/** TODO: The desciption of TimeInstant
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class TimeInstant extends MedTimex3 {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeInstant.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TimeInstant() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TimeInstant(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeInstant(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TimeInstant(JCas jcas, int begin, int end) {
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
  //* Feature: granularity

  /** getter for granularity - gets description of granularity
   * @generated
   * @return value of the feature 
   */
  public String getGranularity() {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_granularity == null)
      jcasType.jcas.throwFeatMissing("granularity", "org.ohnlp.medtime.type.TimeInstant");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_granularity);}
    
  /** setter for granularity - sets description of granularity 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGranularity(String v) {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_granularity == null)
      jcasType.jcas.throwFeatMissing("granularity", "org.ohnlp.medtime.type.TimeInstant");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_granularity, v);}    
   
    
  //*--------------*
  //* Feature: originTime

  /** getter for originTime - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOriginTime() {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_originTime == null)
      jcasType.jcas.throwFeatMissing("originTime", "org.ohnlp.medtime.type.TimeInstant");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_originTime);}
    
  /** setter for originTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOriginTime(String v) {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_originTime == null)
      jcasType.jcas.throwFeatMissing("originTime", "org.ohnlp.medtime.type.TimeInstant");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_originTime, v);}    
   
    
  //*--------------*
  //* Feature: hasNormalizedTime

  /** getter for hasNormalizedTime - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasNormalizedTime() {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasNormalizedTime == null)
      jcasType.jcas.throwFeatMissing("hasNormalizedTime", "org.ohnlp.medtime.type.TimeInstant");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasNormalizedTime);}
    
  /** setter for hasNormalizedTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasNormalizedTime(boolean v) {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasNormalizedTime == null)
      jcasType.jcas.throwFeatMissing("hasNormalizedTime", "org.ohnlp.medtime.type.TimeInstant");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasNormalizedTime, v);}    
   
    
  //*--------------*
  //* Feature: hasOriginTime

  /** getter for hasOriginTime - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasOriginTime() {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasOriginTime == null)
      jcasType.jcas.throwFeatMissing("hasOriginTime", "org.ohnlp.medtime.type.TimeInstant");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasOriginTime);}
    
  /** setter for hasOriginTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasOriginTime(boolean v) {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasOriginTime == null)
      jcasType.jcas.throwFeatMissing("hasOriginTime", "org.ohnlp.medtime.type.TimeInstant");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasOriginTime, v);}    
   
    
  //*--------------*
  //* Feature: hasGranularity

  /** getter for hasGranularity - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasGranularity() {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasGranularity == null)
      jcasType.jcas.throwFeatMissing("hasGranularity", "org.ohnlp.medtime.type.TimeInstant");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasGranularity);}
    
  /** setter for hasGranularity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasGranularity(boolean v) {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasGranularity == null)
      jcasType.jcas.throwFeatMissing("hasGranularity", "org.ohnlp.medtime.type.TimeInstant");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasGranularity, v);}    
   
    
  //*--------------*
  //* Feature: hasApproximation

  /** getter for hasApproximation - gets should be true by default
   * @generated
   * @return value of the feature 
   */
  public boolean getHasApproximation() {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasApproximation == null)
      jcasType.jcas.throwFeatMissing("hasApproximation", "org.ohnlp.medtime.type.TimeInstant");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasApproximation);}
    
  /** setter for hasApproximation - sets should be true by default 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasApproximation(boolean v) {
    if (TimeInstant_Type.featOkTst && ((TimeInstant_Type)jcasType).casFeat_hasApproximation == null)
      jcasType.jcas.throwFeatMissing("hasApproximation", "org.ohnlp.medtime.type.TimeInstant");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TimeInstant_Type)jcasType).casFeatCode_hasApproximation, v);}    
  }

    