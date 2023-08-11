import java.util.Random; //Creates a Random Number generator
import java.util.Scanner; //used to input the data

public class NumberGame
{
    public static void main(String args[])
   {
    int MIN = 1;
    final int MAX = 100;
    int Corrcet_answer, Guess_answer, i, Trials = 5;
    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();
    Corrcet_answer = randomNum.nextInt(MAX - MIN) + MIN;
    for(i=0; i < Trials; i++)
    {
        System.out.println("\nGuess a Number between 1 and 100 within 5 trials: ");
        while(i==0)
        {
            System.out.println("This is your First trial. All the best");
            break;
        }
        while(i==1)
        {
          System.out.println("This is your second trial. All the best");
          break;
        }
        while(i==2)
        {
            System.out.println("This is your third trial. All the best");
            break;
        }
        while(i==3)
        {
            System.out.println("This is your fourth trial, All the best");
            break;
        }
        while(i==4)
        {
            System.out.println("This is your last chance to guess the correct answer, All the best");
            break;
        }
        Guess_answer = input.nextInt();
        if(Guess_answer == Corrcet_answer )
    {
        System.out.println("You have done a great job, The guessed answer was "+Corrcet_answer);
        break;
    }
    else if (Guess_answer < Corrcet_answer && i != Trials - 1)
    {
        System.out.println("the number is Bigger than the guessed number ");
    }
    else if (Guess_answer > Corrcet_answer && i != Trials - 1)
    {
        System.out.println("The number is smaller than the guessed number");
    }

    }
    if(i == Trials)
    {
        System.out.println("You have exhausted the number of trials.\n So, the correct number was: "+Corrcet_answer); 
    }
    


   }

}