

/* First created by JCasGen Mon Apr 04 14:55:54 CDT 2016 */
package org.ohnlp.medtime.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class Duration extends MedTimex3 {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Duration.class);
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
  protected Duration() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Duration(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Duration(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Duration(JCas jcas, int begin, int end) {
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
  //* Feature: durationValue

  /** getter for durationValue - gets 
   * @generated
   * @return value of the feature 
   */
  public double getDurationValue() {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_durationValue == null)
      jcasType.jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.Duration");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Duration_Type)jcasType).casFeatCode_durationValue);}
    
  /** setter for durationValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDurationValue(double v) {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_durationValue == null)
      jcasType.jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.Duration");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Duration_Type)jcasType).casFeatCode_durationValue, v);}    
   
    
  //*--------------*
  //* Feature: durationUnit

  /** getter for durationUnit - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDurationUnit() {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_durationUnit == null)
      jcasType.jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.Duration");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Duration_Type)jcasType).casFeatCode_durationUnit);}
    
  /** setter for durationUnit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDurationUnit(String v) {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_durationUnit == null)
      jcasType.jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.Duration");
    jcasType.ll_cas.ll_setStringValue(addr, ((Duration_Type)jcasType).casFeatCode_durationUnit, v);}    
   
    
  //*--------------*
  //* Feature: hasDurationUnit

  /** getter for hasDurationUnit - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasDurationUnit() {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_hasDurationUnit == null)
      jcasType.jcas.throwFeatMissing("hasDurationUnit", "org.ohnlp.medtime.type.Duration");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Duration_Type)jcasType).casFeatCode_hasDurationUnit);}
    
  /** setter for hasDurationUnit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasDurationUnit(boolean v) {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_hasDurationUnit == null)
      jcasType.jcas.throwFeatMissing("hasDurationUnit", "org.ohnlp.medtime.type.Duration");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Duration_Type)jcasType).casFeatCode_hasDurationUnit, v);}    
   
    
  //*--------------*
  //* Feature: hasDurationValue

  /** getter for hasDurationValue - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasDurationValue() {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_hasDurationValue == null)
      jcasType.jcas.throwFeatMissing("hasDurationValue", "org.ohnlp.medtime.type.Duration");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Duration_Type)jcasType).casFeatCode_hasDurationValue);}
    
  /** setter for hasDurationValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasDurationValue(boolean v) {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_hasDurationValue == null)
      jcasType.jcas.throwFeatMissing("hasDurationValue", "org.ohnlp.medtime.type.Duration");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Duration_Type)jcasType).casFeatCode_hasDurationValue, v);}    
   
    
  //*--------------*
  //* Feature: hasOriginForm

  /** getter for hasOriginForm - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasOriginForm() {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_hasOriginForm == null)
      jcasType.jcas.throwFeatMissing("hasOriginForm", "org.ohnlp.medtime.type.Duration");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Duration_Type)jcasType).casFeatCode_hasOriginForm);}
    
  /** setter for hasOriginForm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasOriginForm(boolean v) {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_hasOriginForm == null)
      jcasType.jcas.throwFeatMissing("hasOriginForm", "org.ohnlp.medtime.type.Duration");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Duration_Type)jcasType).casFeatCode_hasOriginForm, v);}    
  }

    