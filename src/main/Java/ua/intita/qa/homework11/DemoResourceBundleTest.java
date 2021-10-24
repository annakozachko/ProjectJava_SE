package ua.intita.qa.homework11;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoResourceBundleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("uk", "UA");
        Locale locale1 = new Locale("de", "DE");
        Locale locale2 = new Locale("fr", "FR");
        Locale locale3 = new Locale("it", "IT");
        Locale.setDefault(locale1);

        ResourceBundle bundle = ResourceBundle.getBundle("rez.text");
        System.out.println(bundle.containsKey("str1"));
        final String value1 = bundle.getString("str1");
        System.out.println(value1);
        final String value2 = bundle.getString("str2");
        System.out.println(value2);
    }

}
