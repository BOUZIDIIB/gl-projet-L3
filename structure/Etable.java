package structure;

import generateur.map.Map;

public class Etable extends Refuge {
	
	private final static float PRIX_ACHAT = 50000 ;
	
	public Etable(int ligne_init, int colonne_init , String reference , Map map ) {
		super(ligne_init, colonne_init, PRIX_ACHAT , reference , map );
		
	}
	

}
