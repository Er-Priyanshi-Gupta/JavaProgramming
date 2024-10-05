package javaprogramming.numberbasedprograms;

import java.util.Scanner;

public class duck {
    public static boolean isDuck(String num) {
        if (num.charAt(0) == '0') {
            return false;
        }
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Duck or not.");
        String number = sc.nextLine();
        if (isDuck(number)) {
            System.out.println("Number " + number + " is a Duck number");
        } else {
            System.out.println("Number " + number + " is not a Duck number");
        }
        sc.close();
    }
}
