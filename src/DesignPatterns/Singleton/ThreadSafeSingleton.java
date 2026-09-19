package DesignPatterns.Singleton;

public class ThreadSafeSingleton {
    private static  final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    private ThreadSafeSingleton(){}
    public static ThreadSafeSingleton getInstance(){
        return INSTANCE;
    }

    public void simpleMethod(){
        System.out.println("hashcode of singleton object " + INSTANCE);
    }
}
