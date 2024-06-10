package JavaProgramming.NumberBasedPrograms;
import java.util.Scanner;
public class palindrome{
    public static int reverse(int num){
        int rev = 0;
        int d = 0;
        while(num>0){
            d = num%10;
            rev = (rev*10) + d;
            num/= 10;
        }
        return rev;
    }
    public static boolean isPalin(int num){
        if(num == reverse(num)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Palindrome or not.");
        int number = sc.nextInt();
        if(isPalin(number)){
            System.out.println("Number "+ number + " is Palindrome");
        }
        else{System.out.println("Number "+ number + " is not Palindrome");}
        sc.close();
    }
}