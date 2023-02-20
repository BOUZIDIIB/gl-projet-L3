package data.flore;

import data.espece.Milieu;
import data.map.Map;

public class Plante extends Culture{

	public Plante(int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat, String reference ,Map map ) {
		super(nbCase, ligne_init, colonne_init, milieu, dureeVie, prixAchat, reference , map);
	}

}
