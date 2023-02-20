package data.flore;

import data.espece.Milieu;
import data.map.Map;

public class Legume extends Plante{

	private final static int NB_CASE = 4 ;
	private final static int DUREE_VIE = 5 ;
	private final static float PRIX_ACHAT = 20 ;
	
	public Legume( int ligne_init, int colonne_init, Milieu milieu, String reference , Map map ) {
		super(NB_CASE, ligne_init, colonne_init, milieu, DUREE_VIE, PRIX_ACHAT,reference , map);
	}
	
}
