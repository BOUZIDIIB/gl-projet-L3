package acteur;

import java.util.Date;

import travail.Planning;

public class Fermier extends Personne{

	private Date dateNaissance ;
	
	public Fermier(String nom, Planning planning, int ligne, int colonne , Date dateNaissance ) {
		super(nom, planning, ligne, colonne);
		this.dateNaissance=dateNaissance;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	

}
