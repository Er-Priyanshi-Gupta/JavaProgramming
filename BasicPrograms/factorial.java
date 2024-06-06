package JavaProgramming.BasicPrograms;
import java.util.Scanner;

public class factorial {

public int fact (int num){
if(num == 1 || num == 0){
    return 1;
}
else{
    return num*fact(num-1);
}
}
    public static void main (String [] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose factorial you want to calculate\n");
        int number = sc.nextInt();
        factorial obj = new factorial();
        System.out.println(obj.fact(number));
        sc.close();
    }
}
