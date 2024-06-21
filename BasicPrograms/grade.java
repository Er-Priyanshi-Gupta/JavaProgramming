package JavaProgramming.BasicPrograms;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        int avgMarks = 0;
        char grade ;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your marks in 5 subjects out of 100");
        int marks[] = new int[5];
        for(int mark = 0; mark<5; mark++){
            marks[mark]=sc.nextInt();
        }
        for(int mark = 0; mark<5; mark++){
            avgMarks += marks[mark];
        }
        avgMarks = avgMarks/5;
        if (avgMarks < 25)
            grade = 'F';
        else if (avgMarks >= 25 && avgMarks <= 44)
            grade = 'E';
        else if (avgMarks >= 45 && avgMarks <= 59)
            grade = 'D';
        else if (avgMarks >= 50 && avgMarks <= 69)
            grade = 'C';
        else if (avgMarks >= 70 && avgMarks <= 89)
            grade = 'B';
        else
            grade = 'A';
    System.out.println(name+" grade is "+grade+" as your average marks are "+avgMarks);
    sc.close();
    }
}
