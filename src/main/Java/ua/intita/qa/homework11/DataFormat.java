package ua.intita.qa.homework11;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DataFormat {
    public static void main(String[] args) {
        DateFormat dateFormatDE = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, new Locale("de", "DE"));
        DateFormat dateFormatIT = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, new Locale("it", "IT"));
        DateFormat dateFormatFR = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, new Locale("fr", "FR"));
        Date date = new Date();
        System.out.println(date);
        final String formatDE = dateFormatDE.format(date);
        System.out.println(formatDE);
        final String formatIT = dateFormatIT.format(date);
        System.out.println(formatIT);
        final String formatFR = dateFormatFR.format(date);
        System.out.println(formatFR);

        try {
            final Date parse = dateFormatFR.parse("vendredi 22 octobre 2021 10:35:08");
            System.out.println(parse);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
}
