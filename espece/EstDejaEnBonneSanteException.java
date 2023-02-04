package espece;

import notion.Mortel;

public class EstDejaEnBonneSanteException extends Exception{
    public EstDejaEnBonneSanteException(Mortel mortel){
        super(mortel+ "\nEST DEJA EN BONNE SANTE!");
    }
    
}
