
/* First created by JCasGen Thu Jul 14 14:43:49 CDT 2016 */
package org.ohnlp.medtime.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * @generated */
public class LabValueMention_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LabValueMention_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LabValueMention_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LabValueMention(addr, LabValueMention_Type.this);
  			   LabValueMention_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LabValueMention(addr, LabValueMention_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LabValueMention.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.medtime.type.LabValueMention");
 
  /** @generated */
  final Feature casFeat_labTestName;
  /** @generated */
  final int     casFeatCode_labTestName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabTestName(int addr) {
        if (featOkTst && casFeat_labTestName == null)
      jcas.throwFeatMissing("labTestName", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_labTestName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabTestName(int addr, String v) {
        if (featOkTst && casFeat_labTestName == null)
      jcas.throwFeatMissing("labTestName", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_labTestName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labTestValue;
  /** @generated */
  final int     casFeatCode_labTestValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLabTestValue(int addr) {
        if (featOkTst && casFeat_labTestValue == null)
      jcas.throwFeatMissing("labTestValue", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_labTestValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabTestValue(int addr, double v) {
        if (featOkTst && casFeat_labTestValue == null)
      jcas.throwFeatMissing("labTestValue", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_labTestValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labTestMin;
  /** @generated */
  final int     casFeatCode_labTestMin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLabTestMin(int addr) {
        if (featOkTst && casFeat_labTestMin == null)
      jcas.throwFeatMissing("labTestMin", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_labTestMin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabTestMin(int addr, double v) {
        if (featOkTst && casFeat_labTestMin == null)
      jcas.throwFeatMissing("labTestMin", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_labTestMin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labTestMax;
  /** @generated */
  final int     casFeatCode_labTestMax;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLabTestMax(int addr) {
        if (featOkTst && casFeat_labTestMax == null)
      jcas.throwFeatMissing("labTestMax", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_labTestMax);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabTestMax(int addr, double v) {
        if (featOkTst && casFeat_labTestMax == null)
      jcas.throwFeatMissing("labTestMax", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_labTestMax, v);}
    
  
 
  /** @generated */
  final Feature casFeat_time;
  /** @generated */
  final int     casFeatCode_time;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTime(int addr) {
        if (featOkTst && casFeat_time == null)
      jcas.throwFeatMissing("time", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_time);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTime(int addr, int v) {
        if (featOkTst && casFeat_time == null)
      jcas.throwFeatMissing("time", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_time, v);}
    
  
 
  /** @generated */
  final Feature casFeat_assertion;
  /** @generated */
  final int     casFeatCode_assertion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAssertion(int addr) {
        if (featOkTst && casFeat_assertion == null)
      jcas.throwFeatMissing("assertion", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_assertion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAssertion(int addr, String v) {
        if (featOkTst && casFeat_assertion == null)
      jcas.throwFeatMissing("assertion", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_assertion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_valueType;
  /** @generated */
  final int     casFeatCode_valueType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValueType(int addr) {
        if (featOkTst && casFeat_valueType == null)
      jcas.throwFeatMissing("valueType", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_valueType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValueType(int addr, String v) {
        if (featOkTst && casFeat_valueType == null)
      jcas.throwFeatMissing("valueType", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_valueType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labSentence;
  /** @generated */
  final int     casFeatCode_labSentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLabSentence(int addr) {
        if (featOkTst && casFeat_labSentence == null)
      jcas.throwFeatMissing("labSentence", "org.ohnlp.medtime.type.LabValueMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_labSentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabSentence(int addr, int v) {
        if (featOkTst && casFeat_labSentence == null)
      jcas.throwFeatMissing("labSentence", "org.ohnlp.medtime.type.LabValueMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_labSentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LabValueMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_labTestName = jcas.getRequiredFeatureDE(casType, "labTestName", "uima.cas.String", featOkTst);
    casFeatCode_labTestName  = (null == casFeat_labTestName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labTestName).getCode();

 
    casFeat_labTestValue = jcas.getRequiredFeatureDE(casType, "labTestValue", "uima.cas.Double", featOkTst);
    casFeatCode_labTestValue  = (null == casFeat_labTestValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labTestValue).getCode();

 
    casFeat_labTestMin = jcas.getRequiredFeatureDE(casType, "labTestMin", "uima.cas.Double", featOkTst);
    casFeatCode_labTestMin  = (null == casFeat_labTestMin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labTestMin).getCode();

 
    casFeat_labTestMax = jcas.getRequiredFeatureDE(casType, "labTestMax", "uima.cas.Double", featOkTst);
    casFeatCode_labTestMax  = (null == casFeat_labTestMax) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labTestMax).getCode();

 
    casFeat_time = jcas.getRequiredFeatureDE(casType, "time", "org.ohnlp.medtime.type.MedTimex3", featOkTst);
    casFeatCode_time  = (null == casFeat_time) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_time).getCode();

 
    casFeat_assertion = jcas.getRequiredFeatureDE(casType, "assertion", "uima.cas.String", featOkTst);
    casFeatCode_assertion  = (null == casFeat_assertion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_assertion).getCode();

 
    casFeat_valueType = jcas.getRequiredFeatureDE(casType, "valueType", "uima.cas.String", featOkTst);
    casFeatCode_valueType  = (null == casFeat_valueType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_valueType).getCode();

 
    casFeat_labSentence = jcas.getRequiredFeatureDE(casType, "labSentence", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence", featOkTst);
    casFeatCode_labSentence  = (null == casFeat_labSentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labSentence).getCode();

  }
}



    