package espece.faune;

import java.util.Date;

import espece.Milieu;
import generateur.map.Map;
import production.Lait;
import structure.Etable;

public class Vache extends AnimalProducteur{

	private final static int DUREE_VIE = 300 ;
	private final static int PRIX_ACHAT = 1000 ;
	private final static int FREQUENCE_PRODUCTION = 50 ;
	private final static float POIDS = 300 ;
	private final static int QUANTITE = 100 ;
	
	public Vache(int ligne_init, int colonne_init, Date naissance, String nom, String sexe, Etable habitat , String reference , Map map) {
		
		super(ligne_init, colonne_init, Milieu.PLAINE, DUREE_VIE, PRIX_ACHAT, naissance, POIDS, nom, Alimentation.HERBIVORE, sexe, habitat,
				FREQUENCE_PRODUCTION, QUANTITE,new Lait() , reference , map);
		
	}
	

}
