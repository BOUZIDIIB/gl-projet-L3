package structure;


public class RefugeChameau extends Refuge {

	private final static float PRIX_ACHAT = 5000 ;
	
	
	public RefugeChameau(int ligne_init, int colonne_init, String reference) {
		super(ligne_init, colonne_init, PRIX_ACHAT, reference);
		
	}

}
