package data.flore;

import data.espece.Milieu;
import data.map.Map;

/**
 * je vois pas trop l'utilité de cette classe 
 * @author dania
 *
 */
public class Fruit extends Plante{

	public Fruit(int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat,
			float niveauEau, Engrais engrais , String reference , Map map) {
		super(nbCase, ligne_init, colonne_init, milieu, dureeVie, prixAchat, reference , map);
	}

}
