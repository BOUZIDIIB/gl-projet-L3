package flore;

import espece.Milieu;


public abstract class Arbre extends Culture{
	
	private Saison saisonFloraison;
	private int quantiteProduction;

	private final static int NB_CASE = 4 ;
	private final static int DUREE_VIE = 800 ; 
	
	public Arbre( int ligne_init, int colonne_init, Milieu milieu, float prixAchat, Saison saisonFloraison, int quantiteProduction , String reference ) {
		super( NB_CASE, ligne_init, colonne_init, milieu, DUREE_VIE, prixAchat , reference );
		this.saisonFloraison = saisonFloraison;
		this.quantiteProduction = quantiteProduction;
	}
	
	
	public Saison getSaisonFloraison() {
		return saisonFloraison;
	}
	
	public void setSaisonFloraison(Saison saisonFloraison) {
		this.saisonFloraison = saisonFloraison;
	}
	
	public int getQuantiteProduction() {
		return quantiteProduction;
	}
	
	public void setQuantiteProduction(int quantiteProduction) {
		this.quantiteProduction = quantiteProduction;
	}
}
