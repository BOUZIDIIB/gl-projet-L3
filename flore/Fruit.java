package flore;

import espece.Milieu;


/**
 * je vois pas trop l'utilité de cette classe 
 * @author dania
 *
 */
public class Fruit extends Plante{

	public Fruit(int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat,
			float niveauEau, Engrais engrais , String reference ) {
		super(nbCase, ligne_init, colonne_init, milieu, dureeVie, prixAchat, reference);
	}

}
