import java.util.Scanner;
import java.util.Random;

public class demo45 {
    public static void main(String[] args) {
        
    } 
}
class GuesserGame{
       int playerNum = -1;
        int guessNum = 0;
        int count = 0;
        
      
        Random rand = new Random();
        guessNum = rand.nextInt(10);
        do {
           
            if(guessNum<playerNum){
                System.out.println("Slightly higher number");
            }
            else if(guessNum>playerNum){
                System.out.println("Slightly lower number");
            }
            else{
                 System.out.println("Congratulations !!!!!!!");
                System.out.println("You have guessed the number in " + count + " attempts");

            }
        } while (playerNum==guessNum);
        System.out.println("Computer selected number is " + guessNum);
        
      }
}
