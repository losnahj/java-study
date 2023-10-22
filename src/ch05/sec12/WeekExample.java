package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

    public static void main(String[] args) {
        Week week = null;
        week = Week.SUNDAY;

        if (week == Week.SUNDAY) {
            System.out.println("오늘은 일요일입니다");
        }
        Week[] values = Week.values();
        for (Week day : values) {
            System.out.println(day);
        }
        System.out.println(week);
    }

}
