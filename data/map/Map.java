package data.map;

public class Map {
	
	private Case[][] cases ;
	private int nbLignes ;
	private int nbColones ;
	
	// parametrer pour quelle soit à la coordonnée x=0 et y=0 de l'ecrant
	private Case case_inital ;
	private int x ; 
	private int y ;
	
	public Map( int nbLignes, int nbColones , int x , int y ) {
	
		// modification 
		this.x = x;
		this.y = y ;
		
		//		
		this.nbLignes = nbLignes;
		this.nbColones = nbColones;
		
		cases = new Case[nbLignes][nbColones];
		for(int indexLigne=0 ; indexLigne <nbLignes ; indexLigne++) {
			for(int indexColonne=0 ; indexColonne <nbColones;indexColonne++) {
				cases[indexLigne][indexColonne]= new Case(true ,indexLigne , indexColonne);
			}
		}
		case_inital = cases[0][0]; 
	}
	

	public Case getCase_inital() {
		return case_inital;
	}


	public void setCase_inital(Case case_inital) {
		this.case_inital = case_inital;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Case[][] getCases() {
		return cases;
	}


	public int getNbLignes() {
		return nbLignes;
	}

	public int getNbColones() {
		return nbColones;
	}

	public Case getCase(int ligne , int colonne) {
		return cases[ligne][colonne];
	}
	
}
