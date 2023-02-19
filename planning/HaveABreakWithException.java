package planning;

public class HaveABreakWithException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public HaveABreakWithException(Task task){
        super("Have a break with "+ task);
    }
    
}
