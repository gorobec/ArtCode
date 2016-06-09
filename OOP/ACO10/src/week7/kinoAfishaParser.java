package week7;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kinoAfishaParser {
    public static void main(String[] args) throws MalformedURLException {
        String urlText = "";
        try(BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                        new URL("http://kinoafisha.ua/cinema/").openStream()))) {
            String line = "";
           while ((line = br.readLine()) != null) {
                urlText += line + "\n";

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(urlText);

        Pattern cinemaPatern = Pattern.compile("<h3><a href=\"(/cinema/kiev/[0-9A-z -_* -\">]+)\">" +
                "([0-9A-zА-я -_* -\">]+)</a></h3>" +
                "\\s+<p>Адрес: <span>([0-9A-zА-я -_* -\\\">]+)</span></p>\\s+" +
                "<p>Телефон: <span>([0-9 (), -]+)</span></p>");
        Matcher matcher = cinemaPatern.matcher(urlText);

        ArrayList<String> cinemasURL = new ArrayList<>();
        ArrayList<String> cinemasNames = new ArrayList<>();
        ArrayList<String> cinemasAdress = new ArrayList<>();
        ArrayList<String> cinemasPhone = new ArrayList<>();
        while (matcher.find()){
            cinemasURL.add("http://kinoafisha.ua/" + matcher.group(1));
            cinemasNames.add(matcher.group(2));
            cinemasAdress.add(matcher.group(3));
            cinemasPhone.add(matcher.group(4));

        }
        for (int i = 0; i < cinemasURL.size(); i++) {
            System.out.println(cinemasURL.get(i));
            System.out.println(cinemasNames.get(i));
            System.out.println(cinemasAdress.get(i));
            System.out.println(cinemasPhone.get(i));
            System.out.println("************");
        }
       
        /*BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new URL("http://kinoafisha.ua/cinema/").openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}
