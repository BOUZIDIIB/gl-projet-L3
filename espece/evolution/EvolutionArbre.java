package espece.evolution;

import myExceptions.MortException;

public enum EvolutionArbre implements Evolution {
	ARBUSTE, 
	ARBRE_SANS_FEUILLE, 
	ARBRE_AVEC_FEUILLE, 
	ARBRE_FLEURI, 
	ARBRE_AVEC_FRUIT;

	@Override //TODO Discuter de l'évolution d'un Arbre : ici on confond évolution et évolution en fonction des saisons  
	public Evolution evolue() throws MortException {
		switch(this){
			case ARBUSTE:
				return ARBRE_SANS_FEUILLE;
			case ARBRE_SANS_FEUILLE:
				return ARBRE_AVEC_FEUILLE;
			case ARBRE_AVEC_FEUILLE:
				return ARBRE_FLEURI;
			case ARBRE_FLEURI:
				return ARBRE_AVEC_FRUIT;
			default:
				return ARBRE_SANS_FEUILLE;
		}
	}

	
}
