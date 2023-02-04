package structure;

import java.util.ArrayList;

import evolution.EvolutionStructure;
import faune.Animal;

public abstract class Refuge extends Structure{

	private ArrayList<Animal> animals ;

	public Refuge(int ligne_init, int colonne_init, float prixAchat, boolean accessible,
			ArrayList<Animal> animals) {
		super(ligne_init, colonne_init, prixAchat, accessible, EvolutionStructure.ETAT_INITIAL);
		this.animals = animals;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void removeAnimal(Animal animal ) {
		animals.remove(animal);
	}
	
}
