package acteur;

import notion.Mortel.EtatSante;
import stucture_base.Element;
import travail.Planning;

public abstract class Personne extends Element {
	private String nom;
	private Planning planning ;
	private EtatSante etatSante ;
		
	
	public Personne(String nom, Planning planning , int ligne , int colonne  ) {
		super( false, 1 , ligne , colonne );
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


	public void setEtatSante(EtatSante etatSante) {
		this.etatSante = etatSante;
	}
	
	
	

}
