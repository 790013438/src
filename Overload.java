public class Overload {

    public boolean equals(Overload other) {
        System.out.println("equals");
        return true;
    }

    public static void main(String[] args) {
        Object o1 = new Overload();
        Object o2 = new Overload();

        System.out.println(o1.equals(o2));

        Overload o3 = new Overload();
        Overload o4 = new Overload();

        System.out.println(o1.equals(o3));
        System.out.println(o3.equals(o1));
        System.out.println(o3.equals(o4));
    }
}
