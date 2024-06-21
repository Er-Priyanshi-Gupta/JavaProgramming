package JavaProgramming.SequencePrograms;
import java.util.Scanner;
public class LucasSequence {
    public static int lucas(int num){
        if(num == 1){
            return 2;
        }
        else if (num == 2){
            return 1;
        }
        else{
            return lucas(num-1)+ lucas(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the Lucas sequence \n");
        int number = sc.nextInt();
    
        for(int i = 1; i<=number ;i++){
            System.out.print(lucas(i)+" ");
        }
        sc.close();
}
}
