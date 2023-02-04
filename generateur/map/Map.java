package generateur.map;

public class Map {
	
	private Case[][] cases ;
	private int nbLignes ;
	private int nbColones ;
	
	public Map( int nbLignes, int nbColones) {
	
		this.nbLignes = nbLignes;
		this.nbColones = nbColones;
		
		cases = new Case[nbLignes][nbColones];
		for(int indexLigne=0 ; indexLigne <nbLignes ; indexLigne++) {
			for(int indexColonne=0 ; indexColonne <nbColones;indexColonne++) {
				cases[indexLigne][indexColonne]= new Case(true ,indexLigne , indexColonne);
			}
		}
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
