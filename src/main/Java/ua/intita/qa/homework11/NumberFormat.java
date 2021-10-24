package ua.intita.qa.homework11;

import java.text.ParseException;
import java.util.Locale;

public class NumberFormat {
    public static void main(String[] args) {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(Locale.GERMAN);
        java.text.NumberFormat numberFormatUs = java.text.NumberFormat.getInstance(Locale.FRANCE);
        java.text.NumberFormat numberFormatFr = java.text.NumberFormat.getInstance(Locale.ITALY);

        String source = "1.234,567";

        try {
            double number = numberFormat.parse(source).doubleValue();
            System.out.println(number);

            final String formatFR = numberFormatUs.format(number);
            System.out.println(formatFR);

            final String formatIT = numberFormatFr.format(number);
            System.out.println(formatIT);

            final String formatDE = numberFormatFr.format(number);
            System.out.println(formatDE);


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
