import java.util.Scanner;
public class Game32 {
    public static void main(String[] args) {
        int lottery1 = (int)(Math.random()*10);
        int lottery2 = (int)(Math.random()*10);
        int Lottery = lottery1 * 10 + lottery2;
        if(lottery2 == lottery1){
            int lottery3 = (int)(Math.random()*10);
            lottery2 = lottery3;
        }
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your lottery pick(two digits):");
        int guess = input.nextInt();
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        System.out.println("The lottery number is "+Lottery);
        if(guess == Lottery)
            System.out.println("Exact match:you win $10000");
        else if(guessDigit2 == lottery1 && guessDigit1 == lottery2)
            System.out.println("Match one digit:you win $3000");
        else if(guessDigit1 == lottery1 || guessDigit1 == lottery2 || guessDigit2 == lottery1 || guessDigit2 == lottery2)
            System.out.println("Match one digit:you win $1000");
        else
            System.out.println("sorry,no match");
    }
}
