package data.structure;

import data.map.Map;

public class Maison extends Refuge {
	
	private final static float PRIX_ACHAT = 5000 ;
	public Maison(int ligne_init, int colonne_init , String reference , Map map ) {
		super(ligne_init, colonne_init, PRIX_ACHAT , reference , map );
		
	}


}
