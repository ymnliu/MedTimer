

/* First created by JCasGen Mon Apr 04 14:55:54 CDT 2016 */
package org.ohnlp.medtime.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** description of TimeInterval Type
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class TimeInterval extends MedTimex3 {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeInterval.class);
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
  protected TimeInterval() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TimeInterval(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeInterval(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TimeInterval(JCas jcas, int begin, int end) {
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
  //* Feature: startTime

  /** getter for startTime - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeInstant getStartTime() {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.ohnlp.medtime.type.TimeInterval");
    return (TimeInstant)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_startTime)));}
    
  /** setter for startTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartTime(TimeInstant v) {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.ohnlp.medtime.type.TimeInterval");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_startTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endTime

  /** getter for endTime - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeInstant getEndTime() {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.ohnlp.medtime.type.TimeInterval");
    return (TimeInstant)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_endTime)));}
    
  /** setter for endTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTime(TimeInstant v) {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.ohnlp.medtime.type.TimeInterval");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_endTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endDuration

  /** getter for endDuration - gets 
   * @generated
   * @return value of the feature 
   */
  public Duration getEndDuration() {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_endDuration == null)
      jcasType.jcas.throwFeatMissing("endDuration", "org.ohnlp.medtime.type.TimeInterval");
    return (Duration)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_endDuration)));}
    
  /** setter for endDuration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndDuration(Duration v) {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_endDuration == null)
      jcasType.jcas.throwFeatMissing("endDuration", "org.ohnlp.medtime.type.TimeInterval");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_endDuration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: durationValue

  /** getter for durationValue - gets 
   * @generated
   * @return value of the feature 
   */
  public float getDurationValue() {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_durationValue == null)
      jcasType.jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.TimeInterval");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_durationValue);}
    
  /** setter for durationValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDurationValue(float v) {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_durationValue == null)
      jcasType.jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.TimeInterval");
    jcasType.ll_cas.ll_setFloatValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_durationValue, v);}    
   
    
  //*--------------*
  //* Feature: durationUnit

  /** getter for durationUnit - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDurationUnit() {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_durationUnit == null)
      jcasType.jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.TimeInterval");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_durationUnit);}
    
  /** setter for durationUnit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDurationUnit(String v) {
    if (TimeInterval_Type.featOkTst && ((TimeInterval_Type)jcasType).casFeat_durationUnit == null)
      jcasType.jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.TimeInterval");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInterval_Type)jcasType).casFeatCode_durationUnit, v);}    
  }

    