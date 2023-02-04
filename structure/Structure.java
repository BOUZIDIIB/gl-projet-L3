package structure;

import evolution.EvolutionStructure;
import stucture_base.Element;

public  abstract class Structure extends Element  {

	private float prixAchat ;
	private boolean accessible ;
	private EvolutionStructure etat ;
	private Charge[] charges ;
	
	
	public Structure( int ligne_init, int colonne_init, float prixAchat,
			boolean accessible, EvolutionStructure etat) {
		super(false,9, ligne_init, colonne_init);
		this.prixAchat = prixAchat;
		this.accessible = accessible;
		this.etat = etat;
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


	public void setEtat(EvolutionStructure etat) {
		this.etat = etat;
	}


	public Charge[] getCharges() {
		return charges;
	}


	public void setCharges(Charge[] charges) {
		this.charges = charges;
	}
	
	
	
}
