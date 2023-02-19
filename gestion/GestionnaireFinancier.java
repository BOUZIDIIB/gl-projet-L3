package gestion;

import java.util.HashMap;

import finance.Finance;



public class GestionnaireFinancier {
	private HashMap<String, Finance> transactions = new HashMap<>();
	private static GestionnaireFinancier instance = new GestionnaireFinancier();
	
	public HashMap<String, Finance> getTransactions() {
		return transactions;
	}

	private GestionnaireFinancier() {}
	
	public static GestionnaireFinancier getInstance() {
		return instance;
	}
	
	public void add(Finance transaction) {
		transactions.put(transaction.getClass().getSimpleName() + String.valueOf(transactions.size()), transaction);
	}
	
	@Override
	public String toString() {
		StringBuffer transactionsString = new StringBuffer("\t" + getClass().getSimpleName());
		for (Finance transaction : transactions.values()) {
			transactionsString.append("\n\t\t" + transaction.toString());
		}
		return transactionsString.toString();
	}
	
}