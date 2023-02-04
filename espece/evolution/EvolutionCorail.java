package espece.evolution;

public enum EvolutionCorail implements Evolution{
	SQUELETTE, 
	BOURGEON, 
	CORAIL;

	@Override //TODO Comment ça  évolue un corail : ça meurt, ça se vit sous forme de cycle comme un arbre ?
	public Evolution evolue() {
		switch(this){
			case SQUELETTE:
				return BOURGEON;
			case BOURGEON:
				return CORAIL;
			default:
				return CORAIL;
		}
	}

	
}
