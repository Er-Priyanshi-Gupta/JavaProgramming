package JavaProgramming.NumberBasedPrograms;
import java.util.Scanner;
public class automorphic {
    public static int LastDigit(int num) {
        return num%10;
    }
    public static boolean isAutomorphic(int num) {
        return (LastDigit(num) == LastDigit((int)Math.pow(num,2)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Automorphic or not.");
        int number = sc.nextInt();
        if (isAutomorphic(number)) {
            System.out.println("Number " + number + " is Automorphic");
        } else {
            System.out.println("Number " + number + " is not Automorphic");
        }
        sc.close();
    }
}