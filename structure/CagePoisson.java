package structure;

import generateur.map.Map;

public class CagePoisson extends Refuge{

	private final static float PRIX_ACHAT = 50000 ;
	
	public CagePoisson(int ligne_init, int colonne_init, String reference , Map map) {
		super(ligne_init, colonne_init, PRIX_ACHAT, reference , map );
		
	}

}
