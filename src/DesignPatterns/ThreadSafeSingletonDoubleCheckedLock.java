package DesignPatterns;

public class ThreadSafeSingletonDoubleCheckedLock {
    private static volatile ThreadSafeSingletonDoubleCheckedLock instance;
    private ThreadSafeSingletonDoubleCheckedLock(){
        System.out.println("Singleton instance created ");
    }
    public static ThreadSafeSingletonDoubleCheckedLock getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingletonDoubleCheckedLock.class){
                if(instance == null){
                    instance = new ThreadSafeSingletonDoubleCheckedLock();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello From ThreadSafeSingletonDoubleCheckedLock");
    }
}
