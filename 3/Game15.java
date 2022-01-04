import java.util.Scanner;
public class Game15 {
    public static void main(String[] args){
        int lottery = (int)(Math.random() * 1000);
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int num1 = lottery / 100;
        int num2 = (lottery & 100) / 10;
        int num3 = lottery % 10;

        int ber1 = guess / 100;
        int ber2 = (guess % 100) / 10;
        int ber3 = guess % 10;

        System.out.println("Lottery is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match : you win $10,000");
        else if (num1 == ber1 && num2 == ber3 && num3 == ber2 || num1 == ber2 && num2 == ber1 && num3 == ber3 || num1 == ber2 && num2 == ber3 && num3 == ber1 || num1 == ber3 && num2 == ber1 && num3 == ber2 || num1 == ber3 && num2 == ber2 && num3 == ber1)
            System.out.println("March all digits: you win $3,000");
        else if (num1 == ber1 || num2 == ber1 || num3 == ber1 || num1 == ber2 || num2 == ber2 || num3 == ber2 || num1 == ber3 || num2 == ber3 || num3 == ber3)
            System.out.println("March one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
