package planning;

public class AskingToWorkAtIllegalHourException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public AskingToWorkAtIllegalHourException(int hour){
        super("ILLEGAL HOUR : is asking to work at "+ hour);
    }
}
