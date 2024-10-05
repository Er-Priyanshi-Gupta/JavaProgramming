package javaprogramming.numberbasedprograms;
import java.util.Scanner;
public class strong {
    public static int fact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
    public static int sod(int num) {
        int d = 0;
        int sum = 0;
        while (num > 0) {
            d = num % 10;
            sum += fact(d);
            num /= 10;
        }
        return sum;
    }
    public static boolean isStrong(int num) {
        return num == sod(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Strong or not:");
        int number = sc.nextInt();
        if (isStrong(number)) {
            System.out.println("Number " + number + " is Strong");
        } else {
            System.out.println("Number " + number + " is not Strong");
        }
        sc.close();
    }
}
