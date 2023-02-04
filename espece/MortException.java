package espece;

import notion.Mortel;

public class MortException extends Exception{
    public MortException(Mortel mort){
        super(mort + "\nEST MORT!");
    }
    public MortException() {
        super("Meurt");        
    }
}
