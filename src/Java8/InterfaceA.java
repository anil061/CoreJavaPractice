package Java8;

@FunctionalInterface
public interface InterfaceA {
    abstract void A();
    default void hello(){
        System.out.println("Default method in the interface A");
    }
}
