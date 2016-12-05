package week8.date;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

/**
 * Created by gorobec on 16.07.16.
 */
public class NewDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();


        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dayTime = LocalDateTime.now();

        System.out.println(dayTime);


        LocalDate birthDay = LocalDate.of(1989, Month.MARCH, 13);

        Period period = Period.between(birthDay, today);

        System.out.printf("I'm %d years, %d month and %d days\n", period.getYears(), period.getMonths(), period.getDays());

        System.out.println(ChronoUnit.DAYS.between(birthDay, today));

        System.out.println(today.plusDays(4));

        ZonedDateTime kievTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Kiev"));

        ZonedDateTime paris = kievTime.withZoneSameInstant(ZoneId.of("+00:00"));


        System.out.println(kievTime);
        System.out.println(paris);

        Instant instant = Instant.now();
        System.out.println(instant.getEpochSecond());

        Date now = new Date();


    }

}
