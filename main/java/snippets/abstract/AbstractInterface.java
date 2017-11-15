public abstract class AbstractInterface implements Port {

    public AbstractInterface(){
        System.out.println("constructor");
    }


    @Override
    public abstract void print();
}
