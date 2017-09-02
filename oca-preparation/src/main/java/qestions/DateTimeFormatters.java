package qestions;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatters {


    public static void main(String[] args) {
        DateTimeFormatter short_formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter medium_formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        LocalDateTime date1 = LocalDateTime.of(2017, 05, 03, 23, 03, 04, 340);

        System.out.println("short format: " + date1.format(short_formatter));
        System.out.println("medium format: " + date1.format(medium_formatter));
//        System.out.println(date1.format(full_formatter));

        DateTimeFormatter short_formatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter medium_formatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        LocalTime localTime = LocalTime.of(13, 40, 34);
        System.out.println(localTime.format(short_formatter1));
        System.out.println(localTime.format(medium_formatter1));

        LocalDate localDate = LocalDate.of(2017, 04, 07);

        localDate.getMonth();

        DateTimeFormatter short_formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter medium_formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(localDate.format(short_formatter2));
        System.out.println(localDate.format(medium_formatter2));
//        System.out.println(localTime.format(medium_formatter));


    }
}

