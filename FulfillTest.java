class ExceptionA extends Exception {
}
public class FulfillTest {
    public static void main(String[] args) {
        try {
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

}
