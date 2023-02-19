package generateur.game;

import espece.Milieu;
import espece.faune.Animal;
import espece.faune.Mouton;
import espece.faune.Vache;
import finance.Banque;
import flore.Culture;
import flore.Plante;
import flore.Pommier;
import gestion.RessourcesManager;
import structure.Maison;
import structure.Structure;
import process.transaction.Achat;
import process.transaction.Vente;

public class Game {
	private RessourcesManager ressourcesManager = new RessourcesManager();
	private Achat achat = new Achat();
	private Vente vente = new Vente();
	private Banque banque = Banque.getInstance();

	
	
	public RessourcesManager getRessourcesManager() {
		return ressourcesManager;
	}

	public Achat getAchat() {
		return achat;
	}

	public Vente getVente() {
		return vente;
	}

	public Banque getBanque() {
		return banque;
	}

	public RessourcesManager getStockManager() {
		return ressourcesManager;
	}
	
	public void acheter() {
		
		Animal vache = new Vache(0, 0, null, null, null, null, "v1" , null);
		Animal vache2 = new Vache(0, 0, null, null, null, null, "v2", null);
		//Animal vache3 = new Vache(0, 0, null, null, null, null, "v3");
		Animal mouton = new Mouton(0, 0, null, null, null, null, "m0",null);
		Culture plante1 = new Plante(0, 0, 0, null, 0, 500, "p1",null);
		Culture arbre = new Pommier(0, 0, Milieu.PLAINE, "pm1", null);
		Structure maison = new Maison(0, 0, null , null);
		Structure maison2 = new Maison(0, 0, null, null);
		
		achat.addToCart(vache);
		achat.addToCart(vache2);
		//achat.addToCart(vache3);
		achat.addToCart(mouton);
		/*
		 * achat.addToCart(plante1); achat.addToCart(arbre); achat.addToCart(maison);
		 * achat.addToCart(maison2);
		 */
		
		System.out.println(ressourcesManager.getGestionnaireStocks());
		System.out.println(achat.isValidated());
		achat.validateOrder(this);
		System.out.println(achat.isValidated());
		System.out.println(ressourcesManager.getGestionnaireStocks());
		System.out.println(achat);
		
		vente.addToCart(vache);
		vente.addToCart(vache2);
		System.out.println(vente);
		vente.validateSale(this);
		System.out.println(vente.isValidated());
		System.out.println(ressourcesManager.getGestionnaireStocks());
		System.out.println(vente);
		
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.acheter();
	}
}
