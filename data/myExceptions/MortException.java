package data.myExceptions;

import data.notion.Mortel;

public class MortException extends Exception{
   
	private static final long serialVersionUID = 1L;
	public MortException(Mortel mort){
        super(mort + "\nEST MORT!");
    }
    public MortException() {
        super("Meurt");        
    }
}
