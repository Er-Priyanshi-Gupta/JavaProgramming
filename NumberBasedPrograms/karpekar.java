package javaprogramming.numberbasedprograms;
import java.util.Scanner;
public class karpekar {
    public static int square(int num){
        return (int)Math.pow(num,2);
    }
    public static boolean isKaprekar(int num)
{
    String s = Integer.toString(num);
    int first = square(num)%((int)Math.pow(10,s.length()));
    int last = square(num)/((int)Math.pow(10,s.length()));
    if (num == first + last )
        return true;
    else
        return false;
}
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
