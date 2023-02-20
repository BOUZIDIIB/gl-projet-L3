package data.acteur;

import data.map.Map;
import data.travail.Planning;

public class Employee extends Personne {

	private float salaire ;
	public Employee(String nom, Planning planning, int ligne, int colonne , float salaire , String reference , Map map  ) {
		super(nom, planning, ligne, colonne , reference , map);
		this.salaire = salaire;
		
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

}