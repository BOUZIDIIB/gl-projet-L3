package data.espece.evolution;

public enum EvolutionPlante implements Evolution{
	GRAINE, 
	PREMIERE_FEUILLE, 
	PLANTE_VERTE, 
	PLANTE_FLEURIE, 
	PLANTE_MURE;

	@Override //TODO rediscuter de l'évolution d'une plante
	public Evolution evolue() {
		switch(this){
			case GRAINE:
				return PREMIERE_FEUILLE;
			case PREMIERE_FEUILLE:
				return PLANTE_VERTE;
			case PLANTE_VERTE :  
				return PLANTE_FLEURIE;				
			case PLANTE_FLEURIE : 
				return PLANTE_MURE;	
			default :
				return PLANTE_MURE;		
		}	
	}

	
}
