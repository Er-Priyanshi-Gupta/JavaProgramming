package javaprogramming.sequenceprograms;
import java.util.Scanner;
public class TribonacciSequence {
    public static int tribonacci(int num){
        if(num == 1){
            return 0;
        }
        else if (num == 2){
            return 0;
        }
        else if (num == 3){
            return 1;
        }
        else{
            return tribonacci(num-1)+ tribonacci(num-2)+ tribonacci(num-3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the Tribonacci sequence \n");
        int number = sc.nextInt();
    
        for(int i = 1; i<=number ;i++){
            System.out.print(tribonacci(i)+" ");
        }
        sc.close();
}
}
