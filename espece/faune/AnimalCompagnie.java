package espece.faune;

import java.util.Date;

import espece.Milieu;
import structure.Structure;

public abstract class AnimalCompagnie extends Animal  {

	public AnimalCompagnie(int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat , Date naissance, float poids, String nom,
			Alimentation alimentation, String sexe ,Structure habitat , String reference ) {
		super(ligne_init, colonne_init, milieu, dureeVie, prixAchat , naissance, poids, nom, alimentation, sexe,
				habitat,reference );
	}

}
