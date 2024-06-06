package JavaProgramming.FunPrograms;
import java.util.Scanner;
public class kbc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Kaun Banega Crorepati !!\\n");
        System.out.println("\nLets play Kaun Banega Crorepati !!\\n\n");

        String question[] = {"Who was the first Prime Minister of India?","Which planet is known as the Red Planet?","Who wrote the national anthem of India?","What is the capital of France?","Who is known as the \"Missile Man of India\"?","Which element has the chemical symbol 'O'?","What is the largest organ in the human body?","In which year did India gain independence?","Who is the author of \"Harry Potter\" series?","Which is the longest river in the world?","Who is known as the \"Father of the Nation\" in India?","What is the hardest natural substance on Earth?","In which city is the Statue of Liberty located?","Who is the current President of the United States? (As of June 2024)","Which sport is associated with the term 'LBW'?","What is the main ingredient in the Japanese dish 'Sushi'?","Who was the first man to walk on the moon?","Which Indian state is known as the \"Land of Rising Sun\"?"," What does 'CPU' stand for in computers?","Who won the Nobel Prize for Peace in 2014 from India?"};

        String options[][] = {{"Jawaharlal Nehru", "Mahatma Gandhi", "Indira Gandhi", "Sardar Vallabhbhai Patel"},
                   {"Mars", "Venus", "Jupiter", "Saturn"},
                   {"Rabindranath Tagore", "Bankim Chandra Chatterjee", "Sarojini Naidu", "Subhas Chandra Bose"},
                   {"Paris", "Berlin", "Madrid", "Rome"},
                   {"Vikram Sarabhai", "Homi J. Bhabha", "Satish Dhawan", "Dr. A.P.J. Abdul Kalam"},
                   {"Gold", "Oxygen", "Silver", "Iron"},
                   {"Liver", "Skin", "Heart", "Brain"},
                   {"1937", "1947", "1957", "1965"},
                   {"J.R.R. Tolkien", "George R.R. Martin", "J.K. Rowling", "Suzanne Collins"},
                   {"Mississippi", "Yangtze", "Amazon", "Nile"},
                   {"Jawaharlal Nehru", "Mahatma Gandhi", "B.R. Ambedkar", "Sardar Vallabhbhai Patel"},
                   {"Gold", "Iron", "Diamond", "Silver"},
                   {"New York City", "Los Angeles", "Chicago", "San Francisco"},
                   {"Donald Trump", "Joe Biden", "Barack Obama", "Kamala Harris"},
                   {"Cricket", "Tennis", "Football", "Basketball"},
                   {"Rice", "Noodles", "Bread", "Pasta"},
                   {"Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "Michael Collins"},
                   {"Arunachal Pradesh", "Assam", "West Bengal", "Odisha"},
                   {"Computer Power Unit", "Central Power Unit", "Computer Processing Unit", "Central Processing Unit"},
                   {"Malala Yousafzai", "Amartya Sen", "Mother Teresa", "Kailash Satyarthi"}};


        String answer[] ={"Jawaharlal Nehru", "Mars", "Rabindranath Tagore", "Paris", "Dr. A.P.J. Abdul Kalam", "Oxygen", "Skin", "1947", "J.K. Rowling", "Nile", "Mahatma Gandhi", "Diamond", "Diamond", "Joe Biden", "Cricket", "Rice", "Neil Armstrong", "Arunachal Pradesh", "Central Processing Unit", "Kailash Satyarthi"};
        
        int count = 0;
        int amount = 0;
        int flag = 0 ;
        String quit ="";
        int max = 19;
		int min = 0;
		int range = max - min + 1;
		while(count<20 && quit!= "quit") {
			int number = (int)(Math.random() * range) + min;
            System.out.println(question[number] +"\n");
            System.out.println("Options are :- \n");
            for(int i=0;i<4;i++){
                System.out.println(options[number][i]);
            }
            System.out.println("\nType your answer\n");
            String userAnswer = sc.next();
            if(userAnswer == answer[number]){
                count+=1;
                System.out.println("Correct Answer!!\n");
            }
            else{
                System.out.println("Sorry you lose!!\n");
                flag = 1;
                break;
            }
            switch (count) {
                case 0:
                    break;
                case 1:
                    System.out.println("Prize Amount Won ₹1,000/-");
                    amount = 1000;
                    break;
                case 2:
                    System.out.println("Prize Amount Won ₹2,000/-");
                    amount = 2000;
                    break;
                case 3:
                    System.out.println("Prize Amount Won ₹3,000/-");
                    amount = 3000;
                    break;
                case 4:
                    System.out.println("Prize Amount Won ₹5,000/-");
                    amount = 5000;
                    break;
                case 5:
                    System.out.println("Prize Amount Won ₹10,000/-");
                    amount = 10000;
                    break;
                case 6:
                    System.out.println("Prize Amount Won ₹20,000/-");
                    amount = 20000;
                    break;
                case 7:
                    System.out.println("Prize Amount Won ₹40,000/-");
                    amount = 40000;
                    break;
                case 8:
                    System.out.println("Prize Amount Won ₹80,000/-");
                    amount = 80000;
                    break;
                case 9:
                    System.out.println("Prize Amount Won ₹1,60,000/-");
                    amount = 160000;
                    break;
                case 10:
                    System.out.println("Prize Amount Won ₹3,20,000/-");
                    amount = 320000;
                    break;
                case 11:
                    System.out.println("Prize Amount Won ₹6,40,000/-");
                    amount = 640000;
                    break;
                case 12:
                    System.out.println("Prize Amount Won ₹12,50,000/-");
                    amount = 1250000;
                    break;
                case 13:
                    System.out.println("Prize Amount Won ₹25,00,000/-");
                    amount = 2500000;
                    break;
                case 14:
                    System.out.println("Prize Amount Won ₹50,00,000/-");
                    amount = 5000000;
                    break;
                case 15:
                    System.out.println("Prize Amount Won ₹75,00,000/-");
                    amount = 7500000;
                    break;
                case 16:
                    System.out.println("Prize Amount Won ₹1 Crore/-");
                    amount = 10000000;
                    break;
                case 17:
                    System.out.println("Prize Amount Won ₹3 Crore/-");
                    amount = 30000000;
                    break;
                case 18:
                    System.out.println("Prize Amount Won ₹5 Crore/-");
                    amount = 50000000;
                    break;
                case 19:
                    System.out.println("Prize Amount Won ₹7 Crore/-");
                    amount = 70000000;
                    break;
                default:
                    break;
            }
            System.out.println("Do you want to quit. Type quit else type anything\n");
    quit = sc.next();
        }
    switch (count) {
        case 0:break;
        case 1:amount = 1000;
            break;
        case 2:amount = 2000;
            break;
        case 3: amount = 3000;
            break;
        case 4:amount = 5000;
            break;
        case 5:amount = 10000;
            break;
        case 6:amount = 20000;
            break;
        case 7:amount = 40000;
            break;
        case 8:amount = 80000;
            break;
        case 9:amount = 160000;
            break;
        case 10:amount = 320000;
            break;
        case 11:amount = 640000;
            break;
        case 12:amount = 1250000;
            break;
        case 13:amount = 2500000;
            break;
        case 14:amount = 5000000;
            break;
        case 15:amount = 7500000;
            break;
        case 16:amount = 10000000;
            break;
        case 17:amount = 30000000;
            break;
        case 18:amount = 50000000;
            break;
        case 19:amount = 70000000;
            break;
        default:
           
            break;
        }
        if (flag == 1){if (amount >= 10000 && amount <320000){System.out.println("Prize Amount Won ₹10,000/-");}
        else if (amount >=320000 &&  amount < 7500000){System.out.println("Prize Amount Won ₹75,00,000/-");}    
        else
        System.out.println("OPPs you lose");
        } 
    sc.close();}
}
