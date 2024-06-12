package JavaProgramming.NumberBasedPrograms;

import java.util.Scanner;

public class prime {
   
    


    public static void main(String[] args) {
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
