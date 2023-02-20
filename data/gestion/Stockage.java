package data.gestion;

import process.visitor.GestionVisitor;

public interface Stockage {

	<T> T accept(GestionVisitor<T> visitor);
	
}