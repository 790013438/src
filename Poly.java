class Father {
    public static String say() {return "Hello";}
    public String name() {return "Luohao"; }
}

class Son extends Father {
    public static String say() {return "Fuck";}
    public String name() {return "Wangdachui";}
}

public class Poly {

    public static void main(String[] args) {
        Father f = new Son();
        //静态方法属于类
        System.out.println(f.say() + " " + f.name());
    }
}
