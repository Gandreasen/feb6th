
/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter
{
   //public void bob(){ 
   static Thread thread = new Thread();
   public static void main (String args[]) throws InterruptedException{
       for (int c = 60; c >=0; c--){
           thread.sleep(1000);
           System.out.println(c);
        }
    }
}

