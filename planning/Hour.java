package planning;

public class Hour{
    public enum Activity {
        TO_MILK(2),
        TO_SHAVE(2),
        TO_HARVEST(4),
        TO_REST(1);

        private int numberOfHourNeeded; 
        private Activity(int numberOfHourNeeded){
            this.numberOfHourNeeded = numberOfHourNeeded;
        }
        public int getNumberOfHourNeeded() {
            return numberOfHourNeeded;
        }   
    }

    private int hour;
    private Activity activity;

    public Hour(int hour, Activity activity) {
        this.hour = hour;
        setActivity(activity);
    }

    public int getHour() {
        return hour;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setFree() {
        setActivity(Activity.TO_REST);        
    }
    
    public boolean isFreeOfWork() {
        return activity == Activity.TO_REST;        
    }

    public String toString(){
        return "Hour : "+ hour + " | Activity : "+ activity;
    }
}
