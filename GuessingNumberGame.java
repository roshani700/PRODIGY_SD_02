import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame{

    public static void main(String[] args){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int random_number = random.nextInt(10) + 1;
        guessNumber(random_number);

    }
     public static void guessNumber(int random_number){
        Scanner sc=new Scanner(System.in);
        System.err.println(random_number);
        int attempt = 0;
        int guess = 0;

        System.out.println("Welcome to Guessing Game!");
        System.out.println("I have Selected a Number between 1 to 100");
        System.out.println("Game Start.....");
        while(guess != random_number){
            System.out.println("Enter your Guess : ");
            guess = sc.nextInt();
            attempt++;

        if(guess < random_number)
            System.out.println("Your guess is too low !!\n Try again...");
        else if (guess> random_number)
            System.out.println("Your guess is too high!!\n Try again...");
        else{
            System.out.println("Congratulations! You won the Game...");
            System.out.println("Your Total Attempts are: "+attempt);
        }   
    }

    }
}