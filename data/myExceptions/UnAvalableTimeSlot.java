package data.myExceptions;

import data.planning.Task;
import data.planning.TimeSlot;

public class UnAvalableTimeSlot extends Exception {
    
    private static final long serialVersionUID = 1L;
    
	public UnAvalableTimeSlot(TimeSlot timeSlot){
        super(timeSlot + " is unavalable!");
    }
    public UnAvalableTimeSlot(Task task){
        super("is Unavalable for "+ task);
    }

}
