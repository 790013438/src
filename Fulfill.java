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
     * 不能比子类声明更多的方法
     */
    public void foo(int a) {}

    /**
     * overload 重载方法 参数列表不同
     */
    public void foo() throws Exception {}

    /**
     * overload 不能重载方法 重载只认参数列表
     * override 不能重写方法 重写要返回类型一致
     */
    public int foo(int a) {return a;}
}
