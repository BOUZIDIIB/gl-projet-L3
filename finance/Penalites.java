package finance;

import generateur.game.Game;

public abstract class Penalites implements Finance{
	private float montant;
	private int delais;
	private String type;
	private boolean paid;
	private String reference;
	
	public Penalites(float montant, int delais, String type) {
		this.montant = montant;
		this.delais = delais;
		this.type = type;
		paid = false;
	}
	
	public float getMontant() {
		return montant;
	}
	
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	public int getDelais() {
		return delais;
	}
	
	public void setDelais(int delais) {
		this.delais = delais;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
	public void payer(Game game) {
		game.getBanque().debiter(montant);
	}
	
	public String getReference() {
		return reference;
	}
}
