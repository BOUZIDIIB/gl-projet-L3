package acteur;

import travail.Planning;

public class Employee extends Personne {

	private float salaire ;
	public Employee(String nom, Planning planning, int ligne, int colonne , float salaire ) {
		super(nom, planning, ligne, colonne);
		this.salaire = salaire;
		
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

}
