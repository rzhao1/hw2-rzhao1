
/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Sep 24 23:36:14 EDT 2013
 * @generated */
public class Answer_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Answer");
 
  /** @generated */
  final Feature casFeat_isCorrect;
  /** @generated */
  final int     casFeatCode_isCorrect;
  /** @generated */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "edu.cmu.deiis.types.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isCorrect);
  }
  /** @generated */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "edu.cmu.deiis.types.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokens;
  /** @generated */
  final int     casFeatCode_tokens;
  /** @generated */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }
  /** @generated */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);}
    
   /** @generated */
  public int getTokens(int addr, int i) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  }
   
  /** @generated */ 
  public void setTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.deiis.types.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.deiis.types.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngram2Tokens;
  /** @generated */
  final int     casFeatCode_ngram2Tokens;
  /** @generated */ 
  public int getNgram2Tokens(int addr) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens);
  }
  /** @generated */    
  public void setNgram2Tokens(int addr, int v) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngram2Tokens, v);}
    
   /** @generated */
  public int getNgram2Tokens(int addr, int i) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i);
  }
   
  /** @generated */ 
  public void setNgram2Tokens(int addr, int i, int v) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_ngram3Tokens;
  /** @generated */
  final int     casFeatCode_ngram3Tokens;
  /** @generated */ 
  public int getNgram3Tokens(int addr) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens);
  }
  /** @generated */    
  public void setNgram3Tokens(int addr, int v) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngram3Tokens, v);}
    
   /** @generated */
  public int getNgram3Tokens(int addr, int i) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i);
  }
   
  /** @generated */ 
  public void setNgram3Tokens(int addr, int i, int v) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_isCorrect = jcas.getRequiredFeatureDE(casType, "isCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_isCorrect  = (null == casFeat_isCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isCorrect).getCode();

 
    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokens  = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokens).getCode();

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "edu.cmu.deiis.types.Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_ngram2Tokens = jcas.getRequiredFeatureDE(casType, "ngram2Tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_ngram2Tokens  = (null == casFeat_ngram2Tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngram2Tokens).getCode();

 
    casFeat_ngram3Tokens = jcas.getRequiredFeatureDE(casType, "ngram3Tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_ngram3Tokens  = (null == casFeat_ngram3Tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngram3Tokens).getCode();

  }
}



    