

/* First created by JCasGen Thu Jul 14 14:43:49 CDT 2016 */
package org.ohnlp.medtime.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.ohnlp.typesystem.type.textsem.LabLinkerSentence;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class LabValueMention extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LabValueMention.class);
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
  protected LabValueMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LabValueMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LabValueMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LabValueMention(JCas jcas, int begin, int end) {
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
  //* Feature: labTestName

  /** getter for labTestName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabTestName() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestName == null)
      jcasType.jcas.throwFeatMissing("labTestName", "org.ohnlp.medtime.type.LabValueMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestName);}
    
  /** setter for labTestName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabTestName(String v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestName == null)
      jcasType.jcas.throwFeatMissing("labTestName", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestName, v);}    
   
    
  //*--------------*
  //* Feature: labTestValue

  /** getter for labTestValue - gets 
   * @generated
   * @return value of the feature 
   */
  public double getLabTestValue() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestValue == null)
      jcasType.jcas.throwFeatMissing("labTestValue", "org.ohnlp.medtime.type.LabValueMention");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestValue);}
    
  /** setter for labTestValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabTestValue(double v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestValue == null)
      jcasType.jcas.throwFeatMissing("labTestValue", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestValue, v);}    
   
    
  //*--------------*
  //* Feature: labTestMin

  /** getter for labTestMin - gets 
   * @generated
   * @return value of the feature 
   */
  public double getLabTestMin() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestMin == null)
      jcasType.jcas.throwFeatMissing("labTestMin", "org.ohnlp.medtime.type.LabValueMention");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestMin);}
    
  /** setter for labTestMin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabTestMin(double v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestMin == null)
      jcasType.jcas.throwFeatMissing("labTestMin", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestMin, v);}    
   
    
  //*--------------*
  //* Feature: labTestMax

  /** getter for labTestMax - gets 
   * @generated
   * @return value of the feature 
   */
  public double getLabTestMax() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestMax == null)
      jcasType.jcas.throwFeatMissing("labTestMax", "org.ohnlp.medtime.type.LabValueMention");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestMax);}
    
  /** setter for labTestMax - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabTestMax(double v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labTestMax == null)
      jcasType.jcas.throwFeatMissing("labTestMax", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labTestMax, v);}    
   
    
  //*--------------*
  //* Feature: time

  /** getter for time - gets 
   * @generated
   * @return value of the feature 
   */
  public MedTimex3 getTime() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "org.ohnlp.medtime.type.LabValueMention");
    return (MedTimex3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_time)));}
    
  /** setter for time - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTime(MedTimex3 v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_time, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: assertion

  /** getter for assertion - gets Assertion. (e.g. normal, high, low)
   * @generated
   * @return value of the feature 
   */
  public String getAssertion() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_assertion == null)
      jcasType.jcas.throwFeatMissing("assertion", "org.ohnlp.medtime.type.LabValueMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_assertion);}
    
  /** setter for assertion - sets Assertion. (e.g. normal, high, low) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAssertion(String v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_assertion == null)
      jcasType.jcas.throwFeatMissing("assertion", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_assertion, v);}    
   
    
  //*--------------*
  //* Feature: valueType

  /** getter for valueType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValueType() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_valueType == null)
      jcasType.jcas.throwFeatMissing("valueType", "org.ohnlp.medtime.type.LabValueMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_valueType);}
    
  /** setter for valueType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValueType(String v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_valueType == null)
      jcasType.jcas.throwFeatMissing("valueType", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_valueType, v);}    
   
    
  //*--------------*
  //* Feature: labSentence

  /** getter for labSentence - gets 
   * @generated
   * @return value of the feature 
   */
  public LabLinkerSentence getLabSentence() {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labSentence == null)
      jcasType.jcas.throwFeatMissing("labSentence", "org.ohnlp.medtime.type.LabValueMention");
    return (LabLinkerSentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labSentence)));}
    
  /** setter for labSentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabSentence(LabLinkerSentence v) {
    if (LabValueMention_Type.featOkTst && ((LabValueMention_Type)jcasType).casFeat_labSentence == null)
      jcasType.jcas.throwFeatMissing("labSentence", "org.ohnlp.medtime.type.LabValueMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabValueMention_Type)jcasType).casFeatCode_labSentence, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    