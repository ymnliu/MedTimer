
/* First created by JCasGen Sun Oct 23 22:00:54 CDT 2016 */
package org.ohnlp.typesystem.type.textsem;

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

import org.ohnlp.typesystem.type.textspan.Sentence_Type;

/** Sentence with LabLinker info
 * Updated by JCasGen Thu Jan 05 15:24:53 CST 2017
 * @generated */
public class LabLinkerSentence_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LabLinkerSentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LabLinkerSentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LabLinkerSentence(addr, LabLinkerSentence_Type.this);
  			   LabLinkerSentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LabLinkerSentence(addr, LabLinkerSentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LabLinkerSentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
 
  /** @generated */
  final Feature casFeat_annotationText;
  /** @generated */
  final int     casFeatCode_annotationText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnnotationText(int addr) {
        if (featOkTst && casFeat_annotationText == null)
      jcas.throwFeatMissing("annotationText", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotationText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotationText(int addr, String v) {
        if (featOkTst && casFeat_annotationText == null)
      jcas.throwFeatMissing("annotationText", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotationText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_orgSentence;
  /** @generated */
  final int     casFeatCode_orgSentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrgSentence(int addr) {
        if (featOkTst && casFeat_orgSentence == null)
      jcas.throwFeatMissing("orgSentence", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_orgSentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrgSentence(int addr, int v) {
        if (featOkTst && casFeat_orgSentence == null)
      jcas.throwFeatMissing("orgSentence", "org.ohnlp.typesystem.type.textsem.LabLinkerSentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_orgSentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LabLinkerSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_annotationText = jcas.getRequiredFeatureDE(casType, "annotationText", "uima.cas.String", featOkTst);
    casFeatCode_annotationText  = (null == casFeat_annotationText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotationText).getCode();

 
    casFeat_orgSentence = jcas.getRequiredFeatureDE(casType, "orgSentence", "org.ohnlp.typesystem.type.textspan.Sentence", featOkTst);
    casFeatCode_orgSentence  = (null == casFeat_orgSentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_orgSentence).getCode();

  }
}



    