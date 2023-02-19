package process.transaction;

import java.util.HashMap;

import espece.faune.Animal;
import generateur.game.Game;
import gestion.GestionnaireFinancier;
import process.visitor.AddVisitor;

public class Achat extends Transaction{
	private HashMap<String, Buyable> cart = new HashMap<>();

	
	public HashMap<String, Buyable> getCart() {
		return cart;
	}

	public void addToCart(Animal vache) {
		cart.put(vache.getReference(), vache);
		setTotalCost(getTotalCost() + vache.getPrixAchat());
	}
	
	public void removeFromCart(Buyable element) {
		cart.remove(element.getReference());
	}
	
	public void validateOrder(Game game) {
		AddVisitor addVisitor = new AddVisitor();
		setValidated(true);
		System.out.println("Commande validée");
		for (Buyable element : cart.values()) {
			element.accept(addVisitor);
		}
		calculateTotalCost();
		game.getBanque().debiter(getTotalCost());
		GestionnaireFinancier.getInstance().getTransactions().put(getReference(), this);
	}
	
	public void cancelOrder(Game game) {
		System.out.println("Commande annulée !");
		for (Buyable element : cart.values()) {
			cart.remove(element.getReference());
		}
	}
	
	public void calculateTotalCost() {
		setTotalCost(0);
		for(Buyable element : cart.values()) {
			setTotalCost(getTotalCost() + element.getPrixAchat());
		}
	}
	
	public String toString() {
		StringBuffer achats = new StringBuffer("Votre achat : ");
		if (isValidated()) {
			achats.append("\n - montant : " + getTotalCost());
			for (Buyable element : cart.values()) {
				achats.append("\n\t + " + element.toString());
			}
		} else {
			achats.append("n'a pas encore été validé");
		}
		return achats.toString();
	}

}
