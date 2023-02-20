package data.finance;

import java.util.HashMap;

import process.transaction.Transaction;

public class Banque {
	
	private Compte compte = new Compte();
	private HashMap<String, Transaction> historique = new HashMap<>();
	
	private static Banque instance = new Banque();
	
	private Banque() {
	}
	
	public static Banque getInstance() {
		return instance;
	}
	
	public Compte getCompte() {
		return compte;
	}

	public HashMap<String, Transaction> getHistorique() {
		return historique;
	}
	
	public void accrediter(float montant) {
		compte.setSolde(compte.getSolde() + montant);
	}
	
	public void debiter(float montant) {
		compte.setSolde(compte.getSolde() - montant);
	}
		
}
