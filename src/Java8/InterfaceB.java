package Java8;

public interface InterfaceB {
    abstract void A();
    default void hello(){
        System.out.println("method present in the interface B");
    }
}
