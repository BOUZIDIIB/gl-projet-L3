package data.materiel;

import data.gestion.Stockage;
import data.map.Map;
import data.stucture_base.Element;
import process.visitor.GestionVisitor;

public class Outil extends Element implements Stockage{
	
	public Outil(String reference, boolean statique, int nbCase, int ligne_init, int colonne_init , Map map) {
		super(reference, statique, nbCase, ligne_init, colonne_init , map);
		// TODO Auto-generated constructor stub
	}

	@Override
	public <T> T accept(GestionVisitor<T> visitor) {
		visitor.visit(this);
		return null;
	}
	
	public void setStatique() {
		super.setStatique(true);
	}
}
