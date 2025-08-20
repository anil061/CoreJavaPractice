package ThreadConcept;

/*The property of executing multiple threads
and processes at the same time is referred to as concurrency .
A context switch is the process of storing a thread’s current state and
later restoring the state of the thread to continue execution.
*/
public class PrintData implements Runnable {
    @Override
    public void run() {
      for(int i =0; i <3; i++){
          System.out.println("Print Records =>" + i);
      }
    }
    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
    }
}
