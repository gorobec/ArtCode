package week8.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by gorobec on 16.07.16.
 */
public class GC {
    public static void main(String[] args) {
        Calendar gc = new GregorianCalendar(2020, 5, 24);

        DateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");

        System.out.println(sdf.format(gc.getTime()));


    }
}
