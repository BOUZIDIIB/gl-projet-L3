package data.myExceptions;

import data.notion.Mortel;

public class EstDejaEnBonneSanteException extends Exception{
    
	private static final long serialVersionUID = 1L;

	public EstDejaEnBonneSanteException(Mortel mortel){
        super(mortel+ "\nEST DEJA EN BONNE SANTE!");
    }
    
}
