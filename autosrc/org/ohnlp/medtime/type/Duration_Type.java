
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

/** 
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * @generated */
public class Duration_Type extends MedTimex3_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Duration_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Duration_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Duration(addr, Duration_Type.this);
  			   Duration_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Duration(addr, Duration_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Duration.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.medtime.type.Duration");
 
  /** @generated */
  final Feature casFeat_durationValue;
  /** @generated */
  final int     casFeatCode_durationValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getDurationValue(int addr) {
        if (featOkTst && casFeat_durationValue == null)
      jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.Duration");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_durationValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDurationValue(int addr, double v) {
        if (featOkTst && casFeat_durationValue == null)
      jcas.throwFeatMissing("durationValue", "org.ohnlp.medtime.type.Duration");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_durationValue, v);}
    
  
 
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
      jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.Duration");
    return ll_cas.ll_getStringValue(addr, casFeatCode_durationUnit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDurationUnit(int addr, String v) {
        if (featOkTst && casFeat_durationUnit == null)
      jcas.throwFeatMissing("durationUnit", "org.ohnlp.medtime.type.Duration");
    ll_cas.ll_setStringValue(addr, casFeatCode_durationUnit, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasDurationUnit;
  /** @generated */
  final int     casFeatCode_hasDurationUnit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasDurationUnit(int addr) {
        if (featOkTst && casFeat_hasDurationUnit == null)
      jcas.throwFeatMissing("hasDurationUnit", "org.ohnlp.medtime.type.Duration");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasDurationUnit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasDurationUnit(int addr, boolean v) {
        if (featOkTst && casFeat_hasDurationUnit == null)
      jcas.throwFeatMissing("hasDurationUnit", "org.ohnlp.medtime.type.Duration");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasDurationUnit, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasDurationValue;
  /** @generated */
  final int     casFeatCode_hasDurationValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasDurationValue(int addr) {
        if (featOkTst && casFeat_hasDurationValue == null)
      jcas.throwFeatMissing("hasDurationValue", "org.ohnlp.medtime.type.Duration");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasDurationValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasDurationValue(int addr, boolean v) {
        if (featOkTst && casFeat_hasDurationValue == null)
      jcas.throwFeatMissing("hasDurationValue", "org.ohnlp.medtime.type.Duration");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasDurationValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasOriginForm;
  /** @generated */
  final int     casFeatCode_hasOriginForm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasOriginForm(int addr) {
        if (featOkTst && casFeat_hasOriginForm == null)
      jcas.throwFeatMissing("hasOriginForm", "org.ohnlp.medtime.type.Duration");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasOriginForm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasOriginForm(int addr, boolean v) {
        if (featOkTst && casFeat_hasOriginForm == null)
      jcas.throwFeatMissing("hasOriginForm", "org.ohnlp.medtime.type.Duration");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasOriginForm, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Duration_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_durationValue = jcas.getRequiredFeatureDE(casType, "durationValue", "uima.cas.Double", featOkTst);
    casFeatCode_durationValue  = (null == casFeat_durationValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_durationValue).getCode();

 
    casFeat_durationUnit = jcas.getRequiredFeatureDE(casType, "durationUnit", "org.ohnlp.medtime.type.Granularity", featOkTst);
    casFeatCode_durationUnit  = (null == casFeat_durationUnit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_durationUnit).getCode();

 
    casFeat_hasDurationUnit = jcas.getRequiredFeatureDE(casType, "hasDurationUnit", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasDurationUnit  = (null == casFeat_hasDurationUnit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasDurationUnit).getCode();

 
    casFeat_hasDurationValue = jcas.getRequiredFeatureDE(casType, "hasDurationValue", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasDurationValue  = (null == casFeat_hasDurationValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasDurationValue).getCode();

 
    casFeat_hasOriginForm = jcas.getRequiredFeatureDE(casType, "hasOriginForm", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasOriginForm  = (null == casFeat_hasOriginForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasOriginForm).getCode();

  }
}



    