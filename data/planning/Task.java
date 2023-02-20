package data.planning;

import data.espece.EtreVivant;
import data.planning.Hour.Activity;

public class Task {

    private Activity activity;
    private EtreVivant livingBeing;

    public Task(Activity activity, EtreVivant livingBeing) {
        this.activity = activity;
        this.livingBeing = livingBeing;
    }

    public Activity getActivity() {
        return activity;
    }

    public EtreVivant getLivingBeing() {
        return livingBeing;
    }

    @Override
    public String toString() {
        return "Task [activity=" + activity + ", livingBeing=" + livingBeing + "]";
    }

    public int getDuration() {
        return activity.getNumberOfHourNeeded();
    }


    

    



    
    
}
