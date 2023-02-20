package data.espece.evolution;

public enum EvolutionStructure implements Evolution{
	ETAT_INITIAL, 
	ABIME_PAR_CATASTROPHE;

	@Override
	public Evolution evolue() {
		switch(this){
			case ETAT_INITIAL:
				return ABIME_PAR_CATASTROPHE;
			default:
				return ABIME_PAR_CATASTROPHE;
		}
	}


}
