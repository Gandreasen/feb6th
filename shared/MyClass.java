
/**
 * Write a description of class lesson1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



import java.util.Scanner;

public class MyClass{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter some number");
            int user_input_number = scan.nextInt();
            System.out.print("The entered value is " );
            System.out.println(user_input_number );
            
        if (user_input_number < 50)   
            System.out.println("Check the id, they may be too young.");
        else if (user_input_number > 50) 
            System.out.println("I see you like them older.");
        else
            System.out.println("Wow, 50?  Getting there");
            
            
        System.out.println("What are you doing this weekend?");
        
            
        
        
        Scanner scan2 = new Scanner(System.in);
            String user_input_number2 = scan2.nextLine();
            if (user_input_number2.toLowerCase().contains("hunt"))
                System.out.println("Not season!");
            System.out.print("Are you really ");
            System.out.print(user_input_number2 + "?");
            //teacher(scan3);
       // }
           
        //public static void teacher(String scan3) {     
        System.out.println("Who is your favorite teacher?");
        Scanner scan3 = new Scanner(System.in);
        String favTeacher = scan3.nextLine();
        favTeacher = favTeacher.toLowerCase();
        
        while (!favTeacher.equals("andreasen" )){
            System.out.println("Are you sure?  Maybe you spelled his name wrong.");
            favTeacher = scan3.nextLine();
           // teacher (text); 
       
        }
        System.out.println("Your my favorite too!");
        
        counter countdown = new counter();
        countdown.thread();
    }
          
    
    }

    


