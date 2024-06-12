package JavaProgramming.NumberBasedPrograms;

import java.util.Scanner;

public class smith {
    







    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is Smith or not.");
    int number = sc.nextInt();
    if (isSmith(number)) {
        System.out.println("Number " + number + " is Smith");
    } else {
        System.out.println("Number " + number + " is not Smith");
    }
    sc.close();
}
}
