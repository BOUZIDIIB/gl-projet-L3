package espece.faune;

import java.util.Date;

import espece.Milieu;
import generateur.map.Map;
import production.Oeuf;
import structure.Poulallier;

public class Poule extends AnimalProducteur {

	private final static int DUREE_VIE = 500 ;
	private final static int PRIX_ACHAT = 1000 ;
	private final static int FREQUENCE_PRODUCTION = 50 ;
	private final static float POIDS = 50 ;
	private final static int QUANTITE = 10 ;
	
	public Poule(int ligne_init, int colonne_init,Milieu milieu , Date naissance, String nom,  String sexe, Poulallier habitat,String reference , Map map ) {
			 
		super(ligne_init, colonne_init, milieu, DUREE_VIE, PRIX_ACHAT, naissance, POIDS, nom, Alimentation.GRAINIVORE, sexe, habitat,
				FREQUENCE_PRODUCTION, QUANTITE, new Oeuf(), reference , map);
	}

}
