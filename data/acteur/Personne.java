package data.acteur;

import data.map.Map;
import data.notion.Mortel.EtatSante;
import data.stucture_base.Element;
import data.travail.Planning;

public abstract class Personne extends Element {
	private String nom;
	private Planning planning ;
	private EtatSante etatSante ;
		
	
	public Personne(String nom, Planning planning , int ligne , int colonne , String reference , Map map ) {
		super(reference, false, 1 , ligne , colonne , map  );
		this.nom = nom;
		this.planning = planning;
		this.etatSante = EtatSante.BONNE_SANTE;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Planning getPlanning() {
		return planning;
	}


	public void setPlanning(Planning planning) {
		this.planning = planning;
	}


	public EtatSante getEtatSante() {
		return etatSante;
	}

	public void setStatique() {
		super.setStatique(true);
	}
	
	public void setEtatSante(EtatSante etatSante) {
		this.etatSante = etatSante;
	}
	
	
	

}
