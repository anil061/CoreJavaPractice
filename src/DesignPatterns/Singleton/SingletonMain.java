package DesignPatterns.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.simpleMethod();

        ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
                t2.simpleMethod();
    }
}
