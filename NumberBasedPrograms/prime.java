package javaprogramming.numberbasedprograms;
import java.util.Scanner;
public class prime {
   public static boolean isPrime(int num){
    int count = 0;
    for(int i=2;i<=num;i++){
        if (num%i == 0)
            count+=1;
    }
    if (count!=1)
        return false;
    else
     return true;
    }    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is Prime or not.");
    int number = sc.nextInt();
    if (isPrime(number)) {
        System.out.println("Number " + number + " is Prime");
    } else {
        System.out.println("Number " + number + " is not Prime");
    }
    sc.close();
}
}


