package data.structure;

import java.util.ArrayList;

import data.espece.faune.Animal;
import data.map.Map;


public abstract class Refuge extends Structure{

	private ArrayList<Animal> animals ;

	public Refuge(int ligne_init, int colonne_init, float prixAchat, String reference , Map map ) {
		super(ligne_init, colonne_init, prixAchat , reference  , map);
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
