package espece.faune;

import java.util.Date;

import espece.Milieu;
import production.Oeuf;
import structure.Structure;

public class CanardLune extends AnimalProducteur {

	public CanardLune(int ligne_init, int colonne_init, int dureeVie, float prixAchat, Date naissance,
			float poids, String nom, String sexe, Structure habitat, int frequenceProduction,
			int quantiteProduction) {
		super(ligne_init, colonne_init, Milieu.ESPACE, dureeVie, prixAchat, naissance, poids, nom, Alimentation.OMNIVRE, sexe, habitat,
				frequenceProduction, quantiteProduction, new Oeuf());

	}

}
