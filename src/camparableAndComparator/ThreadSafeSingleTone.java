package camparableAndComparator;

public class ThreadSafeSingleTone {

    private static  ThreadSafeSingleTone ins = null;
    public Object ThreadSafeSingleTone() {
        synchronized (ins) {
            if (ins == null) {
                ins = new ThreadSafeSingleTone();
            } else {
                return ins;
            }
            return ins;
        }
    }

}
