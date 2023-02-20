package process.transaction;

import java.util.HashMap;

import data.gestion.GestionnaireFinancier;
import process.game.Game;
import process.visitor.RemoveVisitor;

public class Vente extends Transaction {
	private HashMap<String, Saleable> cart = new HashMap<>();
		
	public HashMap<String, Saleable> getCart() {
		return cart;
	}
	
	public void addToCart(Saleable element) {
		cart.put(element.getReference(), element);
		setTotalCost(getTotalCost() + element.getPrixVente());
	}
	
	public void removeFromCart(Saleable element) {
		cart.remove(element.getReference());
		setTotalCost(getTotalCost() - element.getPrixVente());
	}
		
	public void validateSale(Game game) {
		RemoveVisitor removeVisitor = new RemoveVisitor();
		setValidated(true);
		System.out.println("Vente validée");
		for (Saleable element : cart.values()) {
			element.accept(removeVisitor);
		}
		game.getBanque().accrediter(getTotalCost());
		GestionnaireFinancier.getInstance().getTransactions().put(getReference(), this);
	}
	
	public void calculateTotalCost() {
		setTotalCost(0);
		for(Saleable element : cart.values()) {
			setTotalCost( getTotalCost() + element.getPrixVente());
		}
	}
	
	public String toString() {
		StringBuffer vente = new StringBuffer("Votre vente : ");
		if (isValidated()) {
			vente.append("\n + montant : " + getTotalCost());
			for (Saleable element : cart.values()) {
				vente.append("\n\t - " + element.toString());
			}
		} else {
			vente.append("n'a pas encore été validé");
		}
		return vente.toString();
	}
}
