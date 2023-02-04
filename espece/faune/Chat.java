package espece.faune;

import java.util.Date;

import espece.Milieu;
import structure.Structure;

public class Chat extends AnimalCompagnie{

	public Chat(int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat, Date naissance,
			float poids, String nom, String sexe, Structure habitat) {
		super(ligne_init, colonne_init, milieu, dureeVie, prixAchat, naissance, poids, nom, Alimentation.CARNIVORE, sexe, habitat);

	}

}

// habitat == maison 