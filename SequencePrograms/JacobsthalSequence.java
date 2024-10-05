package javaprogramming.sequenceprograms;
import java.util.Scanner;
public class JacobsthalSequence {
    
    public static int jacobsthal(int num){
        if(num == 1){
            return 0;
        }
        else if (num == 2){
            return 1;
        }
        else{
            return jacobsthal(num-1)+ 2*jacobsthal(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the Jacobsthal sequence \n");
        int number = sc.nextInt();
    
        for(int i = 1; i<=number ;i++){
            System.out.print(jacobsthal(i)+" ");
        }
        sc.close();
}
}
