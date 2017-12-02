class EA extends Exception {}
class EB extends Exception {}

interface C {
    public void foo(int a) throws EB;
}

class A {
    public A() {}

    public void foo(int a) throws EA {}
}

/**
 * 继承的相关理念
 * ==============
 */
class B extends A implements C {

    /**
     * 构造方法不会继承，声明异常，不影响子类
     */
    public B() throws Exception {}

    /**
     * rewrite interface, class
     * 重写了两个的方法，interface的方法，class的方法都重写了
     * 不能比子类声明更多的方法
     */
    public void foo(int a) {}

    /**
     * overload 重载方法
     */
    public void foo() throws Exception {}
}
