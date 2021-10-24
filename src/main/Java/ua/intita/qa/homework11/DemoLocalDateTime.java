package ua.intita.qa.homework11;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DemoLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int dayYear = now.getDayOfYear();
        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Год: " + year);
        System.out.println("День в году: " + dayYear);
        System.out.println("Часы: " + hour);
        System.out.println("Минуты: " + minute);


        LocalDateTime date1 = now.with(ChronoField.HOUR_OF_DAY, 10);
        LocalDateTime date2 = now.withMonth(8);
        LocalDateTime date3 = now.withYear(2013).withMinute(0);
        System.out.println(now.with(ChronoField.HOUR_OF_DAY, 10));
        System.out.println(now.withMonth(8));
        System.out.println(now.withYear(2013).withMinute(0));

        // Сравнение
        boolean after = now.isAfter(date1);
        boolean before = now.isBefore(date1);
        boolean equal = now.equals(date1);
        System.out.println(now.isAfter(date1));
        System.out.println(now.isBefore(date1));
        System.out.println(now.equals(date1));


        // Добавление
        LocalDateTime date4 = now.plusYears(4);
        LocalDateTime date5 = now.plusWeeks(3);
        LocalDateTime date6 = date1.plus(2, ChronoUnit.HOURS);

        // Вычитание
        LocalDateTime date7 = now.minusMonths(2);
        LocalDateTime date8 = now.minusNanos(1);
        LocalDateTime date9 = now.minus(10, ChronoUnit.SECONDS);
    }
}
