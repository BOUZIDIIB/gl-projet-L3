package espece.faune;

import java.util.Date;

import espece.Milieu;
import production.Oeuf;
import structure.Structure;

public class Poisson extends AnimalProducteur{

	public Poisson(int ligne_init, int colonne_init, int dureeVie, float prixAchat, Date naissance,
			float poids, String nom , String sexe, Structure habitat, int frequenceProduction,
			int quantiteProduction) {
		
		super(ligne_init, colonne_init, Milieu.AQUATIQUE, dureeVie, prixAchat, naissance, poids, nom, Alimentation.CARNIVORE, sexe, habitat,
				frequenceProduction, quantiteProduction,new Oeuf());

	}

}

// habitat == mer 