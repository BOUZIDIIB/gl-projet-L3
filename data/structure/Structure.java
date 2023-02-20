package data.structure;

import data.espece.evolution.EvolutionStructure;
import data.gestion.Stockage;
import data.map.Map;
import data.stucture_base.Element;
import process.transaction.Buyable;
import process.visitor.GestionVisitor;

public  abstract class Structure extends Element implements Buyable,Stockage {

	private float prixAchat ;
	private boolean accessible ;
	private EvolutionStructure etat ;
	private Charge[] charges ;
	
	private final static int  NB_CASE = 9 ;
	
	// accessible ?? utilité 
	public Structure( int ligne_init, int colonne_init, float prixAchat , String reference , Map map  ) {
		super(reference ,false,NB_CASE, ligne_init, colonne_init , map);
		this.prixAchat = prixAchat;
		this.accessible = false ;
		this.etat = EvolutionStructure.ETAT_INITIAL;
		charges = new Charge[2];
	}


	public float getPrixAchat() {
		return prixAchat;
	}


	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}


	public boolean isAccessible() {
		return accessible;
	}


	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}


	public EvolutionStructure getEtat() {
		return etat;
	}
	
	public void setStatique() {
		super.setStatique(false);
	}


	public void setEtat(EvolutionStructure etat) {
		this.etat = etat;
	}


	public Charge[] getCharges() {
		return charges;
	}


	public void setCharges(Charge[] charges) {
		this.charges = charges;
	}
	
	

	@Override
	public <T> T accept(GestionVisitor<T> visitor) {
		visitor.visit(this);
		return null;
	}
	
}
