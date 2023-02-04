package structure;

import java.util.ArrayList;

import faune.Animal;

public class Etable extends Refuge {
	
	public final static int CAPACITE = 50 ;

	public Etable(int ligne_init, int colonne_init, float prixAchat, boolean accessible, ArrayList<Animal> animals) {
		super(ligne_init, colonne_init, prixAchat, accessible, animals);
		
	}

	

}
