package flore;

import espece.Milieu;

public class Oranger extends Arbre{

	private final static float PRIX_ACHAT = 100 ;
	private final static int QUANTITE = 100 ;
	
	public Oranger( int ligne_init, int colonne_init, Milieu milieu ,String reference ) {
		super( ligne_init, colonne_init, milieu,PRIX_ACHAT,  Saison.HIVER ,QUANTITE ,reference);
	}

}
