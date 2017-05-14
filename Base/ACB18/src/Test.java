import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by user on 19.09.2016.
 */
public class Test {
    public static void main(String[] args) throws ParseException, DatatypeConfigurationException {
        String date = "2016-05-13 12:15:56.003";
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.setTime(sdf.parse(date));
        cal.setTimeZone(TimeZone.getTimeZone("PST"));
        xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
    }
}
