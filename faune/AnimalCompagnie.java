package faune;

import java.util.Date;

import espece.Milieu;
import evolution.EvolutionAnimal;
import notion.EtatSante;
import structure.Structure;

public abstract class AnimalCompagnie extends Animal  {

	public AnimalCompagnie(int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat , Date naissance, float poids, String nom, Alimentation alimentation, String sexe,
			Structure habitat ) {
		super(ligne_init, colonne_init, milieu, dureeVie, prixAchat, EtatSante.BONNE_SANTE , naissance, poids, nom, alimentation, sexe,
				habitat, EvolutionAnimal.JEUNE);
	}

}
