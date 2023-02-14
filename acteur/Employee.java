package acteur;

import travail.Planning;

public class Employee extends Personne {

	private float salaire ;
	public Employee(String nom, Planning planning, int ligne, int colonne , float salaire , String reference ) {
		super(nom, planning, ligne, colonne , reference);
		this.salaire = salaire;
		
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

}
