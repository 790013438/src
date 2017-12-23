package snippets;

public class StaticConstruct {

    Person person = new Person("Test");

    static {
        System.out.println("test static");
    }

    StaticConstruct() {
        System.out.println("test constructor");
    }

    public static void main (String[] args) {
        new MyClass();
    }
}

class Person {
    static {
        System.out.println("person static");
    }

    Person(String str) {
        System.out.println("person " + str);
    }
}

class MyClass extends StaticConstruct {

    Person person = new Person("MyClass");
    static {
        System.out.println("myclass static");
    }

    MyClass() {
        System.out.println("myclass constructor");
    }
}