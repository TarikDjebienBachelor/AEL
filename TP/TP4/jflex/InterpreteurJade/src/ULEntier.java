public class ULEntier implements Yytoken {

  private Token motcletoken;
  private int valeur;
  
  public ULEntier(int pval){
   this.motcletoken = Token.entier;
   this.valeur = pval;
  }
  public Token getToken(){ 
  return this.motcletoken;
  } 
  public Object getValue(){ 
  return this.valeur;
  } 
  public String toString(){ 
  return "ULEntier "+this.getToken().name()+" "+this.getValue();
  } 

}// class ULEntier
