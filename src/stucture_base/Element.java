package stucture_base;


public  class Element {
	private boolean statique;
	private Position position ;
	private int nbCase ;
	
	
	
	public Element(boolean statique, int nbCase , int ligne_init , int colonne_init) {
		this.statique = statique;
		this.nbCase=nbCase;
		position = new Position(nbCase , ligne_init , colonne_init );
		
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

 	
	
	
	@Override
	public String toString() {

		return " :[ statistique = "+statique+" nbCase = "+nbCase+ "position = "+position ;
	}

	public static void main(String[]args) {
		Element el = new Element(true,9,0,0);
		System.out.println(el);
		
	}
	
}
