package data.stucture_base;

import data.configuration.GameConfiguration;
import data.map.Case;
import data.map.Map;

public  abstract class Element {
	private boolean statique;
	private Position position ;
	private int nbCase ;
	
	/**
	 * la reference d'un objet une fois instancier est unique 
	 */
	private String reference;
	
	
	
	public Element(String reference ,boolean statique, int nbCase , int ligne_init , int colonne_init , Map map ) {
		this.statique = statique;
		this.nbCase=nbCase;
		position = new Position(nbCase , ligne_init , colonne_init , map );
		this.reference = reference  ;
		
	}
	
	// le nom d'un element est unique pour pouvoir etre referencé dans la map  
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
	
	
	  public boolean isOntop() { 
		  return position.getLigne_init()== 0;
	  }
	  
	  public boolean isOnLeft() {
		  return position.getColonne_init()==0;
	  }
	  
	  public boolean isOnRight() { 
		  
		  return (position.getColonne_init()+ position.getNbColonne()) == GameConfiguration.NB_COLONNE  ; 
		 
	  }
	  
	  public boolean isOnBottom() { 
		 return (position.getLigne_init()+position.getNbLigne()) == GameConfiguration.NB_LIGNE -1; 
	 }
	  
	  public boolean isOnBorder() {
		  return isOnBottom() || isOnLeft() || isOnRight() || isOntop() ;
	  }
	  
	  
	@Override
	public String toString() {

		return " :[ statistique = "+statique+" nbCase = "+nbCase+ "position = "+position ;
	}

	
	  public void freePosition() { Case[][] cases = position.getTabCase(); 
	  for(int indexligne =0 ;indexligne < position.getNbLigne() ;indexligne++) { 
		  for(int indexColone=0 ; indexColone < position.getNbColonne(); indexColone++ ) {
			  cases[indexligne][indexColone].setLibre(true); 
			  } 
		  } 
	  }
	 
		
}
