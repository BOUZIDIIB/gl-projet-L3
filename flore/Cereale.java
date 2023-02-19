package flore;

import espece.Milieu;
import generateur.map.Map;

public class Cereale extends Plante{

	private final static int DUREE_VIE = 10 ;
	private final static float PRIX_ACHAT = 100 ;
	private final static int NB_CASE = 9 ; 
	
	public Cereale( int ligne_init, int colonne_init, String reference , Map map) {
		super(NB_CASE, ligne_init, colonne_init, Milieu.PLAINE, DUREE_VIE, PRIX_ACHAT,reference , map );
	}

}
