package structure;

public class CagePoisson extends Refuge{

	private final static float PRIX_ACHAT = 50000 ;
	
	public CagePoisson(int ligne_init, int colonne_init, String reference) {
		super(ligne_init, colonne_init, PRIX_ACHAT, reference);
		
	}

}
