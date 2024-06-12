package JavaProgramming.NumberBasedPrograms;

import java.util.Scanner;

public class squareNumber {
   
    








    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is Kaprekar or not.");
    int number = sc.nextInt();
    if (isKaprekar(number)) {
        System.out.println("Number " + number + " is Kaprekar");
    } else {
        System.out.println("Number " + number + " is not Kaprekar");
    }
    sc.close();
}
}
