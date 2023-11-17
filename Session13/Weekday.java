package Session13;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static String isWeekDay(String day){
        Weekday weekday = Weekday.valueOf(day.toUpperCase());
        return switch(weekday){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
                    FRIDAY -> "Work day";
            case SATURDAY, SUNDAY -> "Weekend";
        };
    }
}