package espece.faune;

import java.util.Date;

import espece.EtreVivant;
import espece.Milieu;

import espece.evolution.EvolutionAnimal;
import myExceptions.MortException;
import structure.Structure;


public abstract class Animal extends EtreVivant{

	private Date naissance ;
	private float poids ;
	private String nom ;
	private Alimentation alimentation ;
	private String sexe ;
	private Structure habitat ;
	private EvolutionAnimal evolution ;
	
	
	public Animal( int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat , Date naissance, float poids, String nom, 
			Alimentation alimentation, String sexe, Structure habitat, String reference) {
		super(1, ligne_init, colonne_init, milieu, dureeVie, prixAchat,1 , reference );
		this.naissance = naissance;
		this.poids = poids;
		this.nom = nom;
		this.alimentation = alimentation;
		this.sexe = sexe;
		this.habitat = habitat;
		this.evolution = EvolutionAnimal.JEUNE;
	}


	public Date getNaissance() {
		return naissance;
	}

	
	public float getPoids() {
		return poids;
	}


	public void setPoids(float poids) {
		this.poids = poids;
	}


	public String getNom() {
		return nom;
	}


	public Alimentation getAlimentation() {
		return alimentation;
	}


	public String getSexe() {
		return sexe;
	}


	public Structure getHabitat() {
		return habitat;
	}


	public void setEvolution(EvolutionAnimal evolution) {
		this.evolution = evolution;
	}


	@Override
	public void vieillir() throws MortException{
		this.evolution = (EvolutionAnimal) evolution.evolue();
	}

	

	
}
