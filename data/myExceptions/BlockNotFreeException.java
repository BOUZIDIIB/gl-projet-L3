package data.myExceptions;

public class BlockNotFreeException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public BlockNotFreeException() {
		super("la position où vous essayez de positionner votre element est déjà occupée ");
	}
	

}
