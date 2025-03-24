package org.humber.week9;


enum Day {
    SUNDAY("Sunday", 1),
    MONDAY("Monday", 2),
    TUESDAY("Tuesday", 3),
    WEDNESDAY("Wednesday", 4),
    THURSDAY("Thursday", 5),
    FRIDAY("Friday", 6),
    SATURDAY("Saturday", 7);

    private final String day;
    private final int dayNumber;

    Day(String day, int dayNumber) {
        this.day = day;
        this.dayNumber = dayNumber;
    }

    public String getDay() {
        return day + " is day number " + dayNumber;
    }
}

public class EnumExample {

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.getDay());
    }

}
