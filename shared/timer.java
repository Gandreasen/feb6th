
 

import java.util.Timer;


public class timer{
    
   /*public static void main(String[] args) {*/
    
   Timer timer = new Timer();   
   TimerTask task = new TimerTask(){
    
       public void run(){
           secondsPassed++;
           Sytem.out.println("Seconds:  " + secondsPassed);
        
        }
       
    
    
    };
    
    public void start() {
        timer.scheduleAtFixedRate(task,1000,1000);
    
    
    }
    
    public static void main(String[] args) {
        timer timerProject = new timer();
        timer.start();
    }
    
}

