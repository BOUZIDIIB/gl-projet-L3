package process.transaction;

import java.util.HashMap;

import data.espece.faune.Animal;
import data.materiel.Engin;
import data.materiel.Outil;
import data.production.Produit;
import data.structure.Structure;
import data.flore.Culture;


public class Market {
	
	private static Market instance = new Market();
	
	private Market() {
	}
	
	public static Market getInstance() {
		return instance;
	}
	
	private HashMap<String, Outil> Outils = new HashMap<>();
	private HashMap<String, Engin> Engins = new HashMap<>();
	private HashMap<String, Animal> Animaux = new HashMap<>();
	private HashMap<String, Culture> Culture = new HashMap<>();
	private HashMap<String, Produit> Produits = new HashMap<>();
	private HashMap<String, Structure> structures = new HashMap<>();
	
	public HashMap<String, Outil> getOutils() {
		return Outils;
	}
	public HashMap<String, Engin> getEngins() {
		return Engins;
	}
	public HashMap<String, Animal> getAnimaux() {
		return Animaux;
	}
	public HashMap<String, Culture> getCulture() {
		return Culture;
	}
	public HashMap<String, Produit> getProduits() {
		return Produits;
	}
	public HashMap<String, Structure> getStructures() {
		return structures;
	}
	
}