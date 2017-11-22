import java.util.Calendar;
import java.time.LocalDateTime;

public class YesterdayCurrent {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);

        System.out.println(calendar.getTime());

        /**
         * Java 8
         */
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);

        System.out.println(yesterday);
    }
}
