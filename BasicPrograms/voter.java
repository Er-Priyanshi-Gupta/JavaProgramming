package JavaProgramming.BasicPrograms;
import java.util.Scanner;
public class voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println(name+" is an adult and is eligible to vote");
        }
        else{
            System.out.println(name+" is not an adult and is not eligible to vote");
        }
        sc.close();
    }
}
