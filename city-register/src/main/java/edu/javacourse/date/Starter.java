package edu.javacourse.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Starter {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
        for (String s : TimeZone.getAvailableIDs()) {
            System.out.println(s);
        }
        for (Locale locale : Locale.getAvailableLocales()) {
            System.out.println(locale.getDisplayLanguage() + " : "
                    + locale.getDisplayCountry() + " : "
                    + locale.getDisplayVariant());
        }
        Calendar c = Calendar.getInstance(new Locale("ua"));
//        c.set(Calendar.HOUR_OF_DAY, 0);
//        System.out.println(c.getTime() );
        System.out.println(c);

    }
}
