package flore;

import espece.Milieu;
import generateur.map.Map;

public class Dattier extends Arbre{

	private final static float PRIX_ACHAT = 500 ;
	private final static int QUANTITE = 100 ;
	
	public Dattier( int ligne_init, int colonne_init, Saison saisonFloraison , String reference , Map map) {
		super( ligne_init, colonne_init, Milieu.DESERT,  PRIX_ACHAT, saisonFloraison, QUANTITE ,reference , map);
	}

}
