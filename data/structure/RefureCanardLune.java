package data.structure;

import data.map.Map;

public class RefureCanardLune extends Refuge {

	private final static float PRIX_ACHAT = 40000 ;
	
	public RefureCanardLune(int ligne_init, int colonne_init , String reference , Map map ) {
		super(ligne_init, colonne_init, PRIX_ACHAT,  reference , map );
	
	}

}
