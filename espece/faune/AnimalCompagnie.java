package espece.faune;

import java.util.Date;

import espece.Milieu;
import generateur.map.Map;
import structure.Structure;

public abstract class AnimalCompagnie extends Animal  {

	public AnimalCompagnie(int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat , Date naissance, float poids, String nom,
			Alimentation alimentation, String sexe ,Structure habitat , String reference , Map map  ) {
		super(ligne_init, colonne_init, milieu, dureeVie, prixAchat , naissance, poids, nom, alimentation, sexe,
				habitat,reference , map );
	}

}
