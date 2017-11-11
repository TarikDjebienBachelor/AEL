import java.awt.Point ;

public class ULPoint implements Yytoken {

  private Token motcletoken;
  private Point valeur;
  
  public ULPoint(int X, int Y){
   this.motcletoken = Token.point;
   this.valeur = new Point(X,Y);
  }
  public Token getToken(){ 
  return this.motcletoken;
  } 
  public Object getValue(){ 
  return this.valeur;
  } 
  public String toString(){ 
  return "ULPoint "+this.getToken().name()+" "+this.getValue().toString();
  } 

}// class ULPoint
