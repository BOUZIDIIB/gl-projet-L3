package flore;

import espece.EtreVivant;
import espece.Milieu;
import espece.evolution.EvolutionPlante;
import generateur.map.Map;
import gestion.Stockage;
import myExceptions.MortException;
import process.visitor.GestionVisitor;

public  abstract class Culture extends EtreVivant implements Stockage{
	

	private Engrais engrais;
	private EvolutionPlante evolution;
	
	public Culture(int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat,  String reference , Map map ) {
		super(nbCase, ligne_init, colonne_init, milieu, dureeVie, prixAchat, 100 , reference , map);
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

	
	@Override
	public <T> T accept(GestionVisitor<T> visitor) {
		visitor.visit(this);
		return null;
	}
}
