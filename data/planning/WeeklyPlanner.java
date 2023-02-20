package data.planning;

import java.util.HashMap;

public class WeeklyPlanner {
    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    public static final DayOfWeek[] days = { DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
            DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY };
    private HashMap<DayOfWeek, DailyPlanner> week = new HashMap<>();

    public WeeklyPlanner(int maxHourOfWorkPerDay) {
        for (int day = 0; day < days.length; day++) {
            week.put(days[day], new DailyPlanner(maxHourOfWorkPerDay));
        }
    }

    public HashMap<DayOfWeek, DailyPlanner> getWeek() {
        return week;
    }


    public String toString(){
        String weekText = "Week";
        for(DayOfWeek day:days){
            weekText+= "\n"+day+ week.get(day).toString();
        }
        return weekText;
    }
}
