package espece.faune;

import java.util.Date;

import espece.Milieu;
import production.Oeuf;
import structure.Structure;

public class Poule extends AnimalProducteur {

	public Poule(int ligne_init, int colonne_init,Milieu milieu , int dureeVie, float prixAchat, Date naissance,
			float poids, String nom,  String sexe, Structure habitat, int frequenceProduction,
			int quantiteProduction ) {
		super(ligne_init, colonne_init, milieu, dureeVie, prixAchat, naissance, poids, nom, Alimentation.GRAINIVORE, sexe, habitat,
				frequenceProduction, quantiteProduction, new Oeuf());
	}

}
