package espece.faune;

import java.util.Date;

import espece.EtreVivant;
import espece.Milieu;
import espece.MortException;
import espece.evolution.EvolutionAnimal;
import structure.Structure;


public class Animal extends EtreVivant{

	private Date naissance ;
	private float poids ;
	private String nom ;
	private Alimentation alimentation ;
	private String sexe ;
	private Structure habitat ;
	private EvolutionAnimal evolution ;
	
	
	public Animal( int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat, EtatSante etatSante, Date naissance, float poids, String nom, 
			Alimentation alimentation, String sexe, Structure habitat, EvolutionAnimal evolution) {
		super(1, ligne_init, colonne_init, milieu, dureeVie, prixAchat,1);
		this.naissance = naissance;
		this.poids = poids;
		this.nom = nom;
		this.alimentation = alimentation;
		this.sexe = sexe;
		this.habitat = habitat;
		this.evolution = evolution;
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
