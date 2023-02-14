package espece.faune;

import java.util.Date;

import espece.Milieu;
import structure.Maison;

public class Chien extends AnimalCompagnie {
	
	private final static int DUREE_VIE = 500 ;
	private final static int PRIX_ACHAT = 1000 ;
	private final static float POIDS = 50 ;
	
	
	public Chien(int ligne_init, int colonne_init, Milieu milieu, Date naissance, String nom, String sexe, Maison habitat , String reference ) {
		super(ligne_init, colonne_init, milieu, DUREE_VIE, PRIX_ACHAT, naissance, POIDS, nom, Alimentation.CARNIVORE, sexe, habitat , reference);
	}

}
