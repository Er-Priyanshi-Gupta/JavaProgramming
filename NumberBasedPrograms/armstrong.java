package JavaProgramming.NumberBasedPrograms;
import java.util.Scanner;

public class armstrong {
    public static int summation(int num) {
        int sum = 0;
        int d;
        int temp = num;
        int len = 0;
        while (temp > 0) {
            temp /= 10;
            len++;
        }
        temp = num; 
        while (temp > 0) {
            d = temp % 10;
            sum += (int)(Math.pow(d, len));
            temp /= 10;
        }
        return sum;
    }
    public static boolean isarmstrong(int num) {
        return num == summation(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Armstrong or not.");
        int number = sc.nextInt();
        
        if (isarmstrong(number)) {
            System.out.println("Number " + number + " is Armstrong");
        } else {
            System.out.println("Number " + number + " is not Armstrong");
        }
        
        sc.close();
    }
}