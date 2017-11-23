class EA extends Exception {}
class EB extends Exception {}

interface C {
    public void foo(int a) throws EB;
}

class A {
    public void foo(int a) throws EA {}
}

/**
 * 继承的相关理念
 * ==============
 */
class B extends A implements C {

    /**
     * rewrite interface, class
     * 重写了两个的方法，interface的方法，class的方法都重写了
     */
    public void foo(int a) {}
}
