package flore;

import espece.Milieu;

public class Plante extends Culture{

	public Plante(int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat, String reference ) {
		super(nbCase, ligne_init, colonne_init, milieu, dureeVie, prixAchat, reference);
	}

}
