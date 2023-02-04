package generateur.map;

/**
 * cette classe represente la case minimal qui composera la map 
 * avec une dimensin fixe 
 * @author dania
 *
 */
public class Case {
	
	
	public final static int DIMENSION = 20;
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
	
	
}
