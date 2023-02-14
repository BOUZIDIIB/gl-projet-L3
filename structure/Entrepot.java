package structure;

import java.util.ArrayList;

import production.Produit;

public class Entrepot extends Structure{

	private ArrayList<Produit> produits ;
	private int capacite =100  ; 
	private final static float PRIX_ACHAT = 50000 ;
	
	public Entrepot(int ligne_init, int colonne_init, String reference) {
		super(ligne_init, colonne_init, PRIX_ACHAT , reference);
		this.produits = new ArrayList<>();
	}

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void addProduit(Produit produit) {
		produits.add(produit);
	}
	public void removeProduit(Produit produit) {
		produits.remove(produit);
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

}
