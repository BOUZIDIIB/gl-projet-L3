package espece.faune;

import java.util.Date;

import espece.Milieu;
import production.Lait;
import structure.Structure;

// equivalent de la vache dans l'espace 
public class Tradigarde extends AnimalProducteur {

	public Tradigarde(int ligne_init, int colonne_init,  int dureeVie, float prixAchat, Date naissance,
			float poids, String nom, String sexe, Structure habitat, int frequenceProduction,
			int quantiteProduction ) {
		super(ligne_init, colonne_init, Milieu.ESPACE, dureeVie, prixAchat, naissance, poids, nom, Alimentation.OMNIVRE, sexe, habitat,
				frequenceProduction, quantiteProduction,new Lait());
		
	}

}
