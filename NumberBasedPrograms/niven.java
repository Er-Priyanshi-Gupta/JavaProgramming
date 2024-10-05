package javaprogramming.numberbasedprograms;
import java.util.Scanner;
public class niven {
    public static int sod(int num){
        int d = 0;
        int sum = 0;
        while(num>0){
            d = num%10;
            sum+= d;
            num/= 10;
        }
        return sum;
    }
    public static boolean isNiven(int num){
        if (num%sod(num)==0){
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Niven or not.");
        int number = sc.nextInt();
        if (isNiven(number)) {
            System.out.println("Number " + number + " is Niven");
        } else {
            System.out.println("Number " + number + " is not Niven");
        }
        sc.close();
    }
}
