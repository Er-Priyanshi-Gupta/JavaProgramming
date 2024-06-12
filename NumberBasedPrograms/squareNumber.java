package JavaProgramming.NumberBasedPrograms;
import java.util.Scanner;
public class squareNumber {
public static int square(int num){
    return (int)Math.pow((int)Math.sqrt(num),2);
}
public static boolean isSquare(int num){
if (num == square(num)){
    return true;
}
else 
return false;
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is Square or not.");
    int number = sc.nextInt();
    if (isSquare(number)) {
        System.out.println("Number " + number + " is Square");
    } else {
        System.out.println("Number " + number + " is not Square");
    }
    sc.close();
}
}
