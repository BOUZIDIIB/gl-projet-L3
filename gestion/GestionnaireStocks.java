package gestion;


import java.util.HashMap;

import espece.EtreVivant;
import espece.faune.Animal;
import flore.Culture;
import production.Produit;




public class GestionnaireStocks {

	private HashMap<String, Animal> gestionnaireAnimaux = new HashMap<>();
	private HashMap<String, Culture> gestionnaireCulture = new HashMap<>();
	private HashMap<String, Produit> gestionnaireProduits = new HashMap<>();
	
	private static GestionnaireStocks instance = new GestionnaireStocks();
	
	private GestionnaireStocks() {}
	
	public static GestionnaireStocks getInstance() {
		return instance;
	}

	public HashMap<String, Animal> getGestionnaireAnimaux() {
		return gestionnaireAnimaux;
	}
	
	public HashMap<String, Culture> getGestionnaireCulture() {
		return gestionnaireCulture;
	}
	
	public HashMap<String, Produit> getGestionnaireProduits() {
		return gestionnaireProduits;
	}
//	public void add(Produit product) {
//		gestionnaireProduits.put(product.getClass().getSimpleName(), product);
//	}
//	
//	public void add(EtreVivant etre) {
//		gestionnaireEtres.put(etre.getClass().getSimpleName(), etre);
//	}
	
	
	public String toString() {
		StringBuffer gestionnaire = new StringBuffer("\t"+ this.getClass().getSimpleName());
		gestionnaire.append("\n\t\t Animaux :");
		for (EtreVivant etre : gestionnaireAnimaux.values()) {
			gestionnaire.append("\n\t\t\t"+ etre.toString());
		}
		gestionnaire.append("\n\t\t Plantes :");
		for (EtreVivant etre : gestionnaireCulture.values()) {
			gestionnaire.append("\n\t\t\t"+ etre.toString());
		}
		gestionnaire.append("\n\t\t Produits :");
		for (Produit product : gestionnaireProduits.values()) {
			gestionnaire.append("\n\t\t\t" + product.toString());
		}
		return gestionnaire.toString();
	}
}
