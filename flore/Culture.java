package flore;

import espece.EtreVivant;
import espece.Milieu;
import espece.evolution.EvolutionPlante;
import myExceptions.MortException;

public  abstract class Culture extends EtreVivant{
	

	private Engrais engrais;
	private EvolutionPlante evolution;
	
	public Culture(int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat,  String reference ) {
		super(nbCase, ligne_init, colonne_init, milieu, dureeVie, prixAchat, 100 , reference);
		this.engrais = new Engrais();
		evolution = EvolutionPlante.GRAINE;
	}

	public Engrais getEngrais() {
		return engrais;
	}

	public void setEngrais(Engrais engrais) {
		this.engrais = engrais;
	}

	@Override
	public void vieillir() throws MortException {
		// TODO Auto-generated method stub
	}
		
	public EvolutionPlante getEvolution() {
		return evolution;
	}

}
