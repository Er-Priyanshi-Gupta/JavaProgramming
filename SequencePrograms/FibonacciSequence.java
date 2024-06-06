package JavaProgramming.SequencePrograms;
import java.util.Scanner;
public class FibonacciSequence{
public static int fibonacci(int num){
    if(num == 1){
        return 0;
    }
    else if (num == 2){
        return 1;
    }
    else{
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a length of the Fibonacci sequence \n");
    int number = sc.nextInt();

    for(int i = 1; i<=number ;i++){
        System.out.print(fibonacci(i)+" ");
    }
    sc.close();
}
}
