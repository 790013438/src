class ExceptionA extends Exception {
}
class ExceptionB extends ExceptionA {
    ExceptionB() {}

    ExceptionB(String value) {}
}

public class FulfillTest {
    public static void main(String[] args) {
        try {
            //里氏替换原则
            throw new ExceptionB("b");
        } catch (ExceptionA e) {
            System.out.println("ExceptionA");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

}
