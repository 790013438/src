import java.util.Calendar;
import java.time.Clock;

public class MilliSecondTest {

    public static void main(String[] args) {

        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(Clock.systemDefaultZone().millis());

    }

}
