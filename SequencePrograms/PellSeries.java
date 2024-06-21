package JavaProgramming.SequencePrograms;
import java.util.Scanner;
public class PellSeries {
    public static int pell(int num){
        if(num == 1){
            return 0;
        }
        else if (num == 2){
            return 1;
        }
        else{
            return 2*pell(num-1)+ pell(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the Pell sequence \n");
        int number = sc.nextInt();
    
        for(int i = 1; i<=number ;i++){
            System.out.print(pell(i)+" ");
        }
        sc.close();
}
}
