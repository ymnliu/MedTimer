
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

/** TODO: The desciption of TimeInstant
 * Updated by JCasGen Thu Jan 05 15:24:52 CST 2017
 * @generated */
public class TimeInstant_Type extends MedTimex3_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TimeInstant_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TimeInstant_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TimeInstant(addr, TimeInstant_Type.this);
  			   TimeInstant_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TimeInstant(addr, TimeInstant_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeInstant.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.medtime.type.TimeInstant");
 
  /** @generated */
  final Feature casFeat_granularity;
  /** @generated */
  final int     casFeatCode_granularity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGranularity(int addr) {
        if (featOkTst && casFeat_granularity == null)
      jcas.throwFeatMissing("granularity", "org.ohnlp.medtime.type.TimeInstant");
    return ll_cas.ll_getStringValue(addr, casFeatCode_granularity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGranularity(int addr, String v) {
        if (featOkTst && casFeat_granularity == null)
      jcas.throwFeatMissing("granularity", "org.ohnlp.medtime.type.TimeInstant");
    ll_cas.ll_setStringValue(addr, casFeatCode_granularity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_originTime;
  /** @generated */
  final int     casFeatCode_originTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOriginTime(int addr) {
        if (featOkTst && casFeat_originTime == null)
      jcas.throwFeatMissing("originTime", "org.ohnlp.medtime.type.TimeInstant");
    return ll_cas.ll_getStringValue(addr, casFeatCode_originTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOriginTime(int addr, String v) {
        if (featOkTst && casFeat_originTime == null)
      jcas.throwFeatMissing("originTime", "org.ohnlp.medtime.type.TimeInstant");
    ll_cas.ll_setStringValue(addr, casFeatCode_originTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasNormalizedTime;
  /** @generated */
  final int     casFeatCode_hasNormalizedTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasNormalizedTime(int addr) {
        if (featOkTst && casFeat_hasNormalizedTime == null)
      jcas.throwFeatMissing("hasNormalizedTime", "org.ohnlp.medtime.type.TimeInstant");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasNormalizedTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasNormalizedTime(int addr, boolean v) {
        if (featOkTst && casFeat_hasNormalizedTime == null)
      jcas.throwFeatMissing("hasNormalizedTime", "org.ohnlp.medtime.type.TimeInstant");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasNormalizedTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasOriginTime;
  /** @generated */
  final int     casFeatCode_hasOriginTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasOriginTime(int addr) {
        if (featOkTst && casFeat_hasOriginTime == null)
      jcas.throwFeatMissing("hasOriginTime", "org.ohnlp.medtime.type.TimeInstant");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasOriginTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasOriginTime(int addr, boolean v) {
        if (featOkTst && casFeat_hasOriginTime == null)
      jcas.throwFeatMissing("hasOriginTime", "org.ohnlp.medtime.type.TimeInstant");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasOriginTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasGranularity;
  /** @generated */
  final int     casFeatCode_hasGranularity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasGranularity(int addr) {
        if (featOkTst && casFeat_hasGranularity == null)
      jcas.throwFeatMissing("hasGranularity", "org.ohnlp.medtime.type.TimeInstant");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasGranularity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasGranularity(int addr, boolean v) {
        if (featOkTst && casFeat_hasGranularity == null)
      jcas.throwFeatMissing("hasGranularity", "org.ohnlp.medtime.type.TimeInstant");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasGranularity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasApproximation;
  /** @generated */
  final int     casFeatCode_hasApproximation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasApproximation(int addr) {
        if (featOkTst && casFeat_hasApproximation == null)
      jcas.throwFeatMissing("hasApproximation", "org.ohnlp.medtime.type.TimeInstant");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasApproximation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasApproximation(int addr, boolean v) {
        if (featOkTst && casFeat_hasApproximation == null)
      jcas.throwFeatMissing("hasApproximation", "org.ohnlp.medtime.type.TimeInstant");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasApproximation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TimeInstant_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_granularity = jcas.getRequiredFeatureDE(casType, "granularity", "org.ohnlp.medtime.type.Granularity", featOkTst);
    casFeatCode_granularity  = (null == casFeat_granularity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_granularity).getCode();

 
    casFeat_originTime = jcas.getRequiredFeatureDE(casType, "originTime", "uima.cas.String", featOkTst);
    casFeatCode_originTime  = (null == casFeat_originTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_originTime).getCode();

 
    casFeat_hasNormalizedTime = jcas.getRequiredFeatureDE(casType, "hasNormalizedTime", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasNormalizedTime  = (null == casFeat_hasNormalizedTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasNormalizedTime).getCode();

 
    casFeat_hasOriginTime = jcas.getRequiredFeatureDE(casType, "hasOriginTime", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasOriginTime  = (null == casFeat_hasOriginTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasOriginTime).getCode();

 
    casFeat_hasGranularity = jcas.getRequiredFeatureDE(casType, "hasGranularity", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasGranularity  = (null == casFeat_hasGranularity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasGranularity).getCode();

 
    casFeat_hasApproximation = jcas.getRequiredFeatureDE(casType, "hasApproximation", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasApproximation  = (null == casFeat_hasApproximation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasApproximation).getCode();

  }
}



    