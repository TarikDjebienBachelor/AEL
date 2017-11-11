import java.io.*;

/** 
 * Classe  FenetreJade - classe de test de la classe FenetreJade.
 * @author Djebien Tarik
 * @version avril 2010
 */

public class TestDessin{
  
  // ATTRIBUT 
  private FenetreJade maFenetre;
  
  // CONSTRUCTEUR
  public TestDessin(FenetreJade f){
  this.maFenetre = f;
  }
  
  // ACCESSEURS
  public FenetreJade getFenetreJade(){
  return this.maFenetre;
  }
  
  // METHODES
  public void unDessin() {
	for(int i = 0; i < 10; i++){
	this.getFenetreJade().nord();
	}
	for(int i = 0; i < 8; i++){
	this.getFenetreJade().est();
	}
	for(int i = 0; i < 6; i++){
	this.getFenetreJade().sud();
	}
	for(int i = 0; i < 4; i++){
	this.getFenetreJade().ouest();
	}
	for(int i = 0; i < 4; i++){
	this.getFenetreJade().sud();
	}
	for(int i = 0; i < 8; i++){
	this.getFenetreJade().est();
	}
  }
  
  /**
   *  méthode principale : création d'une fenetre, et du dessin associé pour representer certaines formes geometriques 
   *                       pour tester l'ensemble des méthodes ecrites dans la classe FenetreJade.
   *  @param  args pas de paramètre attendu
   *  @exception  IOException  si un problème de lecture
   */
  public static void main(String[] args) throws IOException {
        // On cree une instance de la classe FenetreJade
	FenetreJade laFenetreDeMonDessin = new FenetreJade();
	// que l'on associe a notre dessin
	TestDessin  monDessin = new TestDessin(laFenetreDeMonDessin);
	
	/* Réalisation du dessin équivalent au instructions JADE suivante :
		origine (50,70)
		pas 5
		10 fois nord 
		8 fois est
		6 fois sud
		4 fois ouest
		4 fois sud
		8 fois est
		10 fois nord 
		8 fois est
		6 fois sud
		4 fois ouest
		4 fois sud
		8 fois est
		10 fois nord 
		8 fois est
		6 fois sud
		4 fois ouest
		4 fois sud
		8 fois est
		10 fois nord 
		8 fois est
		6 fois sud
		4 fois ouest
		4 fois sud
		8 fois est
		lever
		10 fois nord 
		8 fois est
		6 fois sud
		4 fois ouest
		4 fois sud
		8 fois est
		baisser
		10 fois nord 
		8 fois est
		6 fois sud
		4 fois ouest
		4 fois sud
		8 fois est
	*/

	System.out.println("Programme de Test de la classe FenetreJade.\n");
	System.out.println("INITIALISATION : \n");
	
	System.out.println("La position du crayon sur la fenetre au depart : ("+monDessin.getFenetreJade().getFenetre().getCurrentPoint().getX()+","+monDessin.getFenetreJade().getFenetre().getCurrentPoint().getY()+")");
	System.out.println("le pas du crayon au depart: "+monDessin.getFenetreJade().getPas());
	System.out.println("modification de l'origine (0,0) => (50,70)");
	
	monDessin.getFenetreJade().origine(new java.awt.Point(50,70));
	
	System.out.println("modification du pas a 5 ");
	
	monDessin.getFenetreJade().pas(5);
	
	System.out.println("Pas du crayon actuel : "+monDessin.getFenetreJade().getPas());
	System.out.println("le crayon est-il sur la fenetre de dessin ? "+monDessin.getFenetreJade().getModeDessin());
	System.out.println("La nouvelle position du crayon sur la fenetre : ("+monDessin.getFenetreJade().getFenetre().getCurrentPoint().getX()+","+monDessin.getFenetreJade().getFenetre().getCurrentPoint().getY()+")");
	monDessin.getFenetreJade().lever();
	System.out.println("test de lever() : ");
	System.out.println("le crayon est-il sur la fenetre de dessin ? "+monDessin.getFenetreJade().getModeDessin());
	monDessin.getFenetreJade().baisser();
	System.out.println("test de baisser() : ");
	System.out.println("le crayon est-il sur la fenetre de dessin ? "+monDessin.getFenetreJade().getModeDessin());
	

	
  // ON DESSINE LES MOTIFS SUR LA FEUILLE DE DESSIN	
	
	monDessin.unDessin();
	monDessin.unDessin();
	monDessin.unDessin();
	monDessin.unDessin();
	monDessin.getFenetreJade().lever();
	monDessin.unDessin();
	monDessin.getFenetreJade().baisser();
	monDessin.unDessin();
  
  }// methode principale
  
}// class TestDessin

