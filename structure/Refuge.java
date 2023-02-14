package structure;

import java.util.ArrayList;

import espece.faune.Animal;

public abstract class Refuge extends Structure{

	private ArrayList<Animal> animals ;

	public Refuge(int ligne_init, int colonne_init, float prixAchat, String reference ) {
		super(ligne_init, colonne_init, prixAchat , reference );
		this.animals = new ArrayList<>();
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
