package espece.faune;

import java.util.Date;

import espece.Milieu;
import generateur.map.Map;
import production.Lait;
import structure.RefugeChameau;

public class Chameau extends AnimalProducteur{
	
	private final static int DUREE_VIE = 500 ;
	private final static int PRIX_ACHAT = 1000 ;
	private final static int FREQUENCE_PRODUCTION = 50 ;
	private final static float POIDS = 50 ;
	private final static int QUANTITE = 10 ;
	
	public Chameau(int ligne_init, int colonne_init, Date naissance, String nom, String sexe, RefugeChameau habitat, String reference ,Map map ) {
		
		super(ligne_init, colonne_init, Milieu.DESERT, DUREE_VIE, PRIX_ACHAT, naissance, POIDS, nom, Alimentation.HERBIVORE, sexe, habitat,
				FREQUENCE_PRODUCTION, QUANTITE, new Lait() , reference ,map);
	
	}

	
}
