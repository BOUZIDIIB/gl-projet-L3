package stucture_base;


public  abstract class Element {
	private boolean statique;
	private Position position ;
	private int nbCase ;
	
	/**
	 * la reference d'un objet une fois instancier est unique 
	 */
	private String reference;
	
	
	
	public Element(String reference ,boolean statique, int nbCase , int ligne_init , int colonne_init) {
		this.statique = statique;
		this.nbCase=nbCase;
		position = new Position(nbCase , ligne_init , colonne_init );
		this.reference = reference  ;
		
	}
	
	// le nom d'un element est unique pour pouvoir etre referencé dans la 
	public String getReference() {
		return reference ;
	}
	
	public int getNbCase() {
		return nbCase;
	}

	
	public boolean isStatique() {
		return statique;
	}


	public void setStatique(boolean statique) {
		this.statique = statique;
	}

 	
	public Position getPosition() {
		return position ;
	}
	public void setPosition(int new_ligne , int new_colonne) {
		position.setTabCase(new_ligne, new_colonne);
	}
	
	@Override
	public String toString() {

		return " :[ statistique = "+statique+" nbCase = "+nbCase+ "position = "+position ;
	}

		
}
