
package Sorting;

import java.util.Timer;
import java.util.TimerTask;

public class timertest {
   static int miliseconds = 0;
        
       static Timer t = new Timer();
        static TimerTask task = new TimerTask(){
                public void run(){
                    miliseconds++;
                    System.out.println("ms Passed: " + miliseconds);
                }
        };
    public static void main(String[] args) {
        t.scheduleAtFixedRate(task,1,1);
    }
    
}
