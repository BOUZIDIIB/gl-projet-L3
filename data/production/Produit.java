package data.production;

public abstract  class Produit {
	
	private float prixVente ;
	private String reference;
	


	public Produit(float prixVente) {
		this.prixVente=prixVente;
	}

	public float getPrixVente() {
		return prixVente;
	}
	
	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
}
