package espece.faune;

import java.util.Date;

import espece.Milieu;
import production.Lait;
import structure.Etable;

public class Chevre extends AnimalProducteur{

	
	private final static int DUREE_VIE = 500 ;
	private final static int PRIX_ACHAT = 500 ;
	private final static int FREQUENCE_PRODUCTION = 50 ;
	private final static float POIDS = 40 ;
	private final static int QUANTITE = 20 ;
	
	public Chevre(int ligne_init, int colonne_init, Date naissance, String nom,  String sexe, Etable habitat , String reference ) {
		super(ligne_init, colonne_init, Milieu.MONTAGNE, DUREE_VIE, PRIX_ACHAT, naissance, POIDS, nom, Alimentation.HERBIVORE, sexe, habitat,
				FREQUENCE_PRODUCTION, QUANTITE, new Lait(), reference);
		
	}

}
