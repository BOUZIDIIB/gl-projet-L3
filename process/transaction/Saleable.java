package process.transaction;

import process.visitor.GestionVisitor;

public interface Saleable {

	public <T> T accept(GestionVisitor<T> visitor);
	
	public String getReference();
	
	public float getPrixVente();
	
}
