
/* First created by JCasGen Mon Apr 04 14:55:54 CDT 2016 */
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

/** description of TimeInterval Type
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * @generated */
public class TimeInterval_Type extends MedTimex3_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TimeInterval_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TimeInterval_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TimeInterval(addr, TimeInterval_Type.this);
  			   TimeInterval_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TimeInterval(addr, TimeInterval_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeInterval.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.medtime.type.TimeInterval");
 
  /** @generated */
  final Feature casFeat_startTime;
  /** @generated */
  final int     casFeatCode_startTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartTime(int addr) {
        if (featOkTst && casFeat_startTime == null)
      jcas.throwFeatMissing("startTime", "org.ohnlp.medtime.type.TimeInterval");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartTime(int addr, int v) {
        if (featOkTst && casFeat_startTime == null)
      jcas.throwFeatMissing("startTime", "org.ohnlp.medtime.type.TimeInterval");
    ll_cas.ll_setRefValue(addr, casFeatCode_startTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endTime;
  /** @generated */
  final int     casFeatCode_endTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndTime(int addr) {
        if (featOkTst && casFeat_endTime == null)
      jcas.throwFeatMissing("endTime", "org.ohnlp.medtime.type.TimeInterval");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndTime(int addr, int v) {
        if (featOkTst && casFeat_endTime == null)
      jcas.throwFeatMissing("endTime", "org.ohnlp.medtime.type.TimeInterval");
    ll_cas.ll_setRefValue(addr, casFeatCode_endTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endDuration;
  /** @generated */
  final int     casFeatCode_endDuration;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndDuration(int addr) {
        if (featOkTst && casFeat_endDuration == null)
      jcas.throwFeatMissing("endDuration", "org.ohnlp.medtime.type.TimeInterval");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endDuration);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndDuration(int addr, int v) {
        if (featOkTst && casFeat_endDuration == null)
      jcas.throwFeatMissing("endDuration", "org.ohnlp.medtime.type.TimeInterval");
    ll_cas.ll_setRefValue(addr, casFeatCode_endDuration, v);}
    
  
 
  /** @generated */
  final Feature casFeat_durationValue;
  /** @generated */
  final int     casFeatCode_durationValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getDurationValue(int addr) {
        if (featOkTst && casFeat_durationValue == null)
      jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.TimeInterval");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_durationValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDurationValue(int addr, float v) {
        if (featOkTst && casFeat_durationValue == null)
      jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.TimeInterval");
    ll_cas.ll_setFloatValue(addr, casFeatCode_durationValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_durationUnit;
  /** @generated */
  final int     casFeatCode_durationUnit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDurationUnit(int addr) {
        if (featOkTst && casFeat_durationUnit == null)
      jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.TimeInterval");
    return ll_cas.ll_getStringValue(addr, casFeatCode_durationUnit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDurationUnit(int addr, String v) {
        if (featOkTst && casFeat_durationUnit == null)
      jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.TimeInterval");
    ll_cas.ll_setStringValue(addr, casFeatCode_durationUnit, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TimeInterval_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_startTime = jcas.getRequiredFeatureDE(casType, "startTime", "org.ohnlp.medtime.type.TimeInstant", featOkTst);
    casFeatCode_startTime  = (null == casFeat_startTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startTime).getCode();

 
    casFeat_endTime = jcas.getRequiredFeatureDE(casType, "endTime", "org.ohnlp.medtime.type.TimeInstant", featOkTst);
    casFeatCode_endTime  = (null == casFeat_endTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endTime).getCode();

 
    casFeat_endDuration = jcas.getRequiredFeatureDE(casType, "endDuration", "org.ohnlp.medtime.type.Duration", featOkTst);
    casFeatCode_endDuration  = (null == casFeat_endDuration) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endDuration).getCode();

 
    casFeat_durationValue = jcas.getRequiredFeatureDE(casType, "durationValue", "uima.cas.Float", featOkTst);
    casFeatCode_durationValue  = (null == casFeat_durationValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_durationValue).getCode();

 
    casFeat_durationUnit = jcas.getRequiredFeatureDE(casType, "durationUnit", "org.ohnlp.medtime.type.Granularity", featOkTst);
    casFeatCode_durationUnit  = (null == casFeat_durationUnit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_durationUnit).getCode();

  }
}



    