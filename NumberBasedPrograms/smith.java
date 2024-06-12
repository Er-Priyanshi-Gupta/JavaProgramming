package JavaProgramming.NumberBasedPrograms;
import java.util.Scanner;
public class smith {
    public static int sod(int num){
        int d = 0;
        int sum = 0;
        while(num>0){
            d = num%10;
            sum+= d;
            num/= 10;
        }
        return sum;
    }
    public static boolean isPrime(int num){
        int count = 0;
        for(int i=2;i<=num;i++){
            if (num%i == 0)
                count+=1;
        }
        if (count!=1)
            return false;
        else
         return true;
        }  
public static int factors(int num){
    int factSum = 0;
    int i = 2;
    while(num>1){
        if(num%i == 0 && isPrime(i)){
            factSum+= sod(i);
            num/= i;
        }
        else{
            i+= 1;
        }
    }
    return factSum;
}
    public static boolean isSmith(int num){
        if (isPrime(num))
        return false;
        else
        return (sod(num) == factors(num));
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is Smith or not.");
    int number = sc.nextInt();
    if (isSmith(number)) {
        System.out.println("Number " + number + " is Smith");
    } else {
        System.out.println("Number " + number + " is not Smith");
    }
    sc.close();
}
}
