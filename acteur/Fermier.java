package acteur;

import java.awt.Image;
import java.util.Date;

import travail.Planning;

public class Fermier extends Personne{
	private Image farmerImage ;

	private Date dateNaissance ;
	
	public Fermier(String nom, Planning planning, int ligne, int colonne , Date dateNaissance ,String reference ) {
		super(nom, planning, ligne, colonne , reference);
		this.dateNaissance=dateNaissance;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public Image getFarmerImage() {
		return farmerImage;
	}
	
	public void setFarmerImage(Image farmerImage) {
		this.farmerImage = farmerImage;
	}
	

}
