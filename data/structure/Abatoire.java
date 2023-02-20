package data.structure;

import data.map.Map;

public class Abatoire extends StructureAction{

	private final static float PRIX_ACHAT = 50000 ;
	
	public Abatoire(int ligne_init, int colonne_init, String reference , Map map ) {
		super(ligne_init, colonne_init, PRIX_ACHAT, reference , map);
	}
	
}
