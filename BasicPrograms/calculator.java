package javaprogramming.basicprograms;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Operations done by the calculator on two numbers are: +, -, *, /, %");
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the Operator");
        String operator = sc.next();
        if(operator.equals("+")){
            System.out.println(num1 + num2);
        }
        else if(operator.equals("-")){
            System.out.println(num1 - num2);
        }
        else if(operator.equals("*")){
            System.out.println(num1 * num2);
        }
        else if(operator.equals("/")){
            System.out.println(num1 / num2);
        }
        else if(operator.equals("%")){
            System.out.println(num1 % num2);
        }
        else {
            System.out.println("Invalid Operator");
        }
        sc.close();
    }
    

}
