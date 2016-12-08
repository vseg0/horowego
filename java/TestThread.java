class MyRunnable implements Runnable {
   private Thread t;
   private String threadName;
   
   MyRunnable( String name) {
      threadName = name;
      System.out.println("Create thread: " +  threadName );
   }
   
   public void run() {
      System.out.println("Run thread: " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Start thread: " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
   
   // public final void setName(String name)
   // public final void setPriority(int priority)
   // public final void setDaemon(boolean on)

   /* The current thread invokes this method on a second thread, causing the current thread to block 
    *until the second thread terminates or the specified number of milliseconds passes. 
	*/
   // public final void join(long millisec)
   
   /* Interrupts this thread, causing it to continue execution if it was blocked for any reason. */
   // public void interrupt()
   
   /* Returns true if the thread is alive, which is any time after the thread has been started but 
    * before it runs to completion. 
	*/
   // public final boolean isAlive()

}

public class TestThread {

   public static void main(String args[]) {
      MyRunnable R1 = new MyRunnable( "tread_1");
      R1.start();
      
      MyRunnable R2 = new MyRunnable( "thread_2");
      R2.start();
   }   
}