package javaprogramming.numberbasedprograms;
import java.util.Scanner;
public class perfect {
   public static int factSum(int num){
    int sum = 0;
    for(int i=1; i<num; i++){
        if(num%i == 0){
            sum+= i;
        }
    }
    return sum ;
   }
   public static boolean isPerfect(int num){
    if(num == factSum(num)){
        return true;
    }
    else 
    return false;
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is Perfect or not.");
    int number = sc.nextInt();
    if (isPerfect(number)) {
        System.out.println("Number " + number + " is Perfect");
    } else {
        System.out.println("Number " + number + " is not Perfect");
    }
    sc.close();
}
}
