package structure;


public class Poulallier  extends Refuge{

	private final static float PRIX_ACHAT = 20000 ;
	
	public Poulallier(int ligne_init, int colonne_init,String reference) {
		super(ligne_init, colonne_init, PRIX_ACHAT, reference);
	}

}
