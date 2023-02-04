package faune;

import java.util.Date;

import espece.EtreVivant;
import espece.Milieu;
import evolution.EvolutionAnimal;
import notion.EtatSante;
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
		super(1, ligne_init, colonne_init, milieu, dureeVie, prixAchat,1 , EtatSante.BONNE_SANTE);
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


	public EvolutionAnimal getEvolution() {
		return evolution;
	}


	public void setEvolution(EvolutionAnimal evolution) {
		this.evolution = evolution;
	}
	
	// calcule d'age par rapport a la date dans le jeu 

	
}
