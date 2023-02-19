package flore;

import espece.Milieu;
import generateur.map.Map;

public class Corail extends Culture{

	private final static int  NB_CASE = 4 ;
	private final static int DUREE_VIE = 500 ;
	private final static float PRIX_ACHAT = 1000 ;
	
	
	public Corail( int ligne_init, int colonne_init , String reference , Map map ) {
		super(NB_CASE, ligne_init, colonne_init, Milieu.AQUATIQUE, DUREE_VIE, PRIX_ACHAT,  reference ,map);
	}

}
