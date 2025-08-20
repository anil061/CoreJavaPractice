package Java8;

public class ImplementationClass implements  InterfaceA, InterfaceB{


    @Override
    public void A() {
        System.out.println("My own implementation");
    }

    @Override
    public void hello() {
        InterfaceB.super.hello();
    }


    public static void main(String[] args) {
       ImplementationClass imp = new ImplementationClass();
       imp.hello();
       imp.A();

    }
}
