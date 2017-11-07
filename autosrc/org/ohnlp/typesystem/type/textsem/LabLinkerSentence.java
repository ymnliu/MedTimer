

/* First created by JCasGen Sun Oct 23 22:00:54 CDT 2016 */
package org.ohnlp.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.ohnlp.typesystem.type.textspan.Sentence;


import org.apache.uima.jcas.tcas.Annotation;


/** Sentence with LabLinker info
 * Updated by JCasGen Thu Jan 05 15:24:53 CST 2017
 * XML source: /Users/m142167/Documents/workspace/MedTimer/descsrc/org/ohnlp/medtime/types/LabLinkerTypes.xml
 * @generated */
public class LabLinkerSentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LabLinkerSentence.class);
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
  protected LabLinkerSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LabLinkerSentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LabLinkerSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LabLinkerSentence(JCas jcas, int begin, int end) {
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
  //* Feature: annotationText

  /** getter for annotationText - gets annotated LabLinker sentence fro raw text
   * @generated
   * @return value of the feature 
   */
  public String getAnnotationText() {
    if (LabLinkerSentence_Type.featOkTst && ((LabLinkerSentence_Type)jcasType).casFeat_annotationText == null)
      jcasType.jcas.throwFeatMissing("annotationText", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LabLinkerSentence_Type)jcasType).casFeatCode_annotationText);}
    
  /** setter for annotationText - sets annotated LabLinker sentence fro raw text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotationText(String v) {
    if (LabLinkerSentence_Type.featOkTst && ((LabLinkerSentence_Type)jcasType).casFeat_annotationText == null)
      jcasType.jcas.throwFeatMissing("annotationText", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((LabLinkerSentence_Type)jcasType).casFeatCode_annotationText, v);}    
   
    
  //*--------------*
  //* Feature: orgSentence

  /** getter for orgSentence - gets 
   * @generated
   * @return value of the feature 
   */
  public Sentence getOrgSentence() {
    if (LabLinkerSentence_Type.featOkTst && ((LabLinkerSentence_Type)jcasType).casFeat_orgSentence == null)
      jcasType.jcas.throwFeatMissing("orgSentence", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabLinkerSentence_Type)jcasType).casFeatCode_orgSentence)));}
    
  /** setter for orgSentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrgSentence(Sentence v) {
    if (LabLinkerSentence_Type.featOkTst && ((LabLinkerSentence_Type)jcasType).casFeat_orgSentence == null)
      jcasType.jcas.throwFeatMissing("orgSentence", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabLinkerSentence_Type)jcasType).casFeatCode_orgSentence, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    