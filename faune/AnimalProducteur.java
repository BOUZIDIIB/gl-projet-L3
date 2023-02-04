package faune;

import java.util.Date;

import espece.Milieu;
import evolution.EvolutionAnimal;
import notion.EtatSante;
import production.Produit;
import structure.Structure;

public abstract class AnimalProducteur extends Animal{

	private int frequenceProduction ;
	private int quantiteProduction ;
	private Produit produit ;
	
	
	public AnimalProducteur(int ligne_init, int colonne_init, Milieu milieu, int dureeVie, float prixAchat, Date naissance, float poids, String nom, Alimentation alimentation, String sexe,
			Structure habitat, int frequenceProduction, int quantiteProduction,
			Produit produit) {
		super(ligne_init, colonne_init, milieu, dureeVie, prixAchat, EtatSante.BONNE_SANTE, naissance, poids, nom, alimentation,
				sexe, habitat, EvolutionAnimal.JEUNE);
		this.frequenceProduction = frequenceProduction;
		this.quantiteProduction = quantiteProduction;
		this.produit = produit;
	}


	public int getFrequenceProduction() {
		return frequenceProduction;
	}


	public void setFrequenceProduction(int frequenceProduction) {
		this.frequenceProduction = frequenceProduction;
	}


	public int getQuantiteProduction() {
		return quantiteProduction;
	}


	public void setQuantiteProduction(int quantiteProduction) {
		this.quantiteProduction = quantiteProduction;
	}


	public Produit getProduit() {
		return produit;
	}


	
}
