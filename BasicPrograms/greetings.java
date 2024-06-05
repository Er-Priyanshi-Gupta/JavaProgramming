package JavaProgramming.BasicPrograms;
import java.time.LocalDateTime;
import java.util.Scanner;    
public class greetings{       
  public static void main(String[] argvs){   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.next();
        System.out.println(java.time.LocalTime.now());    
        int hour = LocalDateTime.now().getHour();
        if (hour >= 4 && hour <= 11)
        System.out.println("Good Moring "+ name);
        else if (hour >= 12 && hour <= 16)
        System.out.println("Good Afternoon "+ name);
        else if (hour >= 17 && hour <= 20)
        System.out.println("Good Evening "+ name);
        else
        System.out.println("Good Night "+ name);
        sc.close();
  }      
}  