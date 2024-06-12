package JavaProgramming.NumberBasedPrograms;

import java.util.Scanner;

public class strong {
    














    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is Strong or not.");
    int number = sc.nextInt();
    if (isStrong(number)) {
        System.out.println("Number " + number + " is Strong");
    } else {
        System.out.println("Number " + number + " is not Strong");
    }
    sc.close();
}
}
