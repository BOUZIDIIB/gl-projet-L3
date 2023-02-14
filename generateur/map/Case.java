package generateur.map;

/**
 * cette classe represente la case minimal qui composera la map 
 * avec une dimensin fixe 
 * @author dania
 *
 */
public class Case {
	
	private boolean libre = true;
	private int ligne ;
	private int colonne;
	
	

	public Case(boolean libre, int ligne, int colonne) {
		this.libre = libre;
		this.ligne = ligne;
		this.colonne = colonne;
	}

	public int getLigne() {
		return ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public Case(boolean libre) {
		super();
		this.libre = libre;
	}
	
	
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	@Override
	public String toString() {
		return "Case [libre=" + libre + ", ligne=" + ligne + ", colonne=" + colonne + "]";
	}
	
	public boolean equals(Object o ) {
		if( o instanceof Case) {
			Case c = (Case)o ;
			return c.getColonne() == colonne && c.getLigne() == ligne ;
		}
		return false ;
	}
	
	
}
