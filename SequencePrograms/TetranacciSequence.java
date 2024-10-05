package javaprogramming.sequenceprograms;
import java.util.Scanner;
public class TetranacciSequence {
    public static int tetranacci(int num){
        if(num == 1){
            return 0;
        }
        else if (num == 2){
            return 1;
        }
        else if (num == 3){
            return 1;
        }
        else if (num == 4){
            return 2;
        }
        else{
            return tetranacci(num-1)+ tetranacci(num-2)+ tetranacci(num-3)+ tetranacci(num-4);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the Tetranacci sequence \n");
        int number = sc.nextInt();
    
        for(int i = 1; i<=number ;i++){
            System.out.print(tetranacci(i)+" ");
        }
        sc.close();
}
}
