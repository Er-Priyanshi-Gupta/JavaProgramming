package javaprogramming.numberbasedprograms;
import java.util.Scanner;
public class happy {
    public static int sod(int num){
        int d = 0 ;
     int square = 0;
    while (num>0){
        d = num%10;
        square = square + (int)Math.pow(d,2);
        num/=10;
        }  
    return square;
    }
    public static boolean isHappy(int num){
        int happy = sod(num);
    while(true){
        if (happy == 1){
            return true;
               }      
        else if (happy>9) 
        happy = sod(happy);
        else
         return false;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Happy or not.");
        int number = sc.nextInt();
        if (isHappy(number)) {
            System.out.println("Number " + number + " is a Happy number");
        } else {
            System.out.println("Number " + number + " is not a Happy number");
        }
        sc.close();
    }
}
