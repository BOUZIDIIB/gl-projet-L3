package espece.faune;

import java.util.Date;

import espece.Milieu;
import structure.Maison;

public class Chat extends AnimalCompagnie{

	
	private final static int DUREE_VIE = 500 ;
	private final static int PRIX_ACHAT = 100 ;
	private final static float POIDS = 50 ;	
	
	public Chat(int ligne_init, int colonne_init, Milieu milieu,  Date naissance,String nom, Maison habitat , String sexe, String reference ) {
		super(ligne_init, colonne_init, milieu, DUREE_VIE, PRIX_ACHAT, naissance, POIDS, nom, Alimentation.CARNIVORE, sexe, habitat ,reference );

	}

}

// habitat == maison 