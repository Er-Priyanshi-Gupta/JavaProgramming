package JavaProgramming.SequencePrograms;
import java.util.Scanner;
public class PadovanSequence {
    public static int padovan(int num){
        if(num == 1){
            return 1;
        }
        else if (num == 2){
            return 1;
        }
        else if (num == 3){
            return 1;
        }
        else{
            return padovan(num-2)+ padovan(num-3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the Padovan sequence \n");
        int number = sc.nextInt();
    
        for(int i = 1; i<=number ;i++){
            System.out.print(padovan(i)+" ");
        }
        sc.close();
}
}
