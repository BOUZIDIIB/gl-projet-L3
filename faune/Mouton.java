package faune;

import java.util.Date;

import espece.Milieu;
import production.Laine;
import structure.Structure;

public class Mouton extends AnimalProducteur {

	public Mouton(int ligne_init, int colonne_init, int dureeVie, float prixAchat, Date naissance,
			float poids, String nom, String sexe, Structure habitat, int frequenceProduction,
			int quantiteProduction) {
		super(ligne_init, colonne_init, Milieu.PLAINE, dureeVie, prixAchat, naissance, poids, nom, Alimentation.HERBIVORE, sexe, habitat,
				frequenceProduction, quantiteProduction, new Laine());
		
	}

}
