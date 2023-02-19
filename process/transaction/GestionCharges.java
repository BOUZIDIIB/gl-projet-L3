package process.transaction;

import java.util.HashMap;

import finance.Penalites;
import generateur.game.Game;

public class GestionCharges {
	private HashMap<String, Penalites> transactions = new HashMap<>();
	
	public void payer(Penalites charge, Game game) {
		game.getBanque().debiter(charge.getMontant());
		transactions.remove(charge.getReference());
		game.getRessourcesManager().getGestionnaireFinancier().add(charge);
	}
	
	public void ajouterPenalite(Penalites penalite) {
		transactions.put(penalite.getReference(), penalite);
	}
	
}
