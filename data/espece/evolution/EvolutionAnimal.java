package data.espece.evolution;

import data.myExceptions.MortException;

public enum EvolutionAnimal implements Evolution{
	JEUNE, 
	ADULTE, 
	VIEUX;

	@Override
	public Evolution evolue() throws MortException {
		switch(this){
			case JEUNE:
				return ADULTE;
			case ADULTE:
				return VIEUX;
			case VIEUX:
				throw new MortException();
			default:
				throw new MortException();
		}
	}

	
}
