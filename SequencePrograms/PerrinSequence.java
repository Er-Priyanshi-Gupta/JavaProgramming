package javaprogramming.sequenceprograms;
import java.util.Scanner;
public class PerrinSequence {
    public static int perrin(int num){
        if(num == 1){
            return 3;
        }
        else if (num == 2){
            return 0;
        }
        else if (num == 3){
            return 2;
        }
        else{
            return perrin(num-2)+ perrin(num-3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the Perrin sequence \n");
        int number = sc.nextInt();
    
        for(int i = 1; i<=number ;i++){
            System.out.print(perrin(i)+" ");
        }
        sc.close();
}
}
