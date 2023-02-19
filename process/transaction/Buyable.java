package process.transaction;

import process.visitor.GestionVisitor;

public interface Buyable {

	public <T> T accept(GestionVisitor<T> visitor);
	
	public String getReference();
	
	public float getPrixAchat();
}
