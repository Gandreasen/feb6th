
/**
 * Write a description of class apples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class apples
{
    public static void main(String args[]){
        Scanner bucky;
        bucky = new Scanner ( System.in );
        System.out.println("What is your name?");
        String userName;
        userName = bucky.nextLine();
        
        System.out.println("Your name is " + userName);
        
    }
}
    