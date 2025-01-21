package DateAndTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeApi {
    public static void main(String[] args) {
        // there are so many methods are present in the java for date and time and we can access by defining class name because they are
        //static
        LocalDate date=LocalDate.now();

        System.out.println(date);

        System.out.println(date.getDayOfMonth());

        System.out.println(date.getDayOfYear());

        LocalTime time =LocalTime.now();

        System.out.println(time);

        System.out.println(time.getHour());
    }
}
