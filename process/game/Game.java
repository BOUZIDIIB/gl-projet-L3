package process.game;


import data.espece.Milieu;
import data.espece.faune.Animal;
import data.espece.faune.Mouton;
import data.espece.faune.Vache;
import data.finance.Banque;
import data.flore.Culture;
import data.flore.Plante;
import data.flore.Pommier;
import data.gestion.RessourcesManager;
import data.map.Map;
import data.structure.Maison;
import data.structure.Structure;
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
	
	public void acheter(Map map ) {
		
	
		Animal vache = new Vache(0, 0, null, null, null, null, "v1" , map);
		Animal vache2 = new Vache(0, 0, null, null, null, null, "v2", map);
		//Animal vache3 = new Vache(0, 0, null, null, null, null, "v3");
		Animal mouton = new Mouton(0, 0, null, null, null, null, "m0",map);
		Culture plante1 = new Plante(0, 0, 0, null, 0, 500, "p1",map);
		Culture arbre = new Pommier(0, 0, Milieu.PLAINE, "pm1", map);
		Structure maison = new Maison(0, 0, null , map);
		Structure maison2 = new Maison(0, 0, null, map);
		
		achat.addToCart(vache);
		achat.addToCart(vache2);
		//achat.addToCart(vache3);
		achat.addToCart(mouton);
		
		  achat.addToCart(plante1); 
		  achat.addToCart(arbre);
		  achat.addToCart(maison);
		  achat.addToCart(maison2);
		 
		
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
		MapManager manager = GameBuilder.MapBuilder();
		game.acheter(manager.getMap());
	}
}
