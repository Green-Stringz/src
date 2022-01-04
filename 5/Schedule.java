import java.util.Scanner;
public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loan = input.nextDouble();
        System.out.print("Numeber of years:");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate:");
        double InterestRate = input.nextDouble();
        double MonthlyPayment = loan * (InterestRate / 1200) / (1 - 1 / Math.pow(1 + InterestRate / 1200, years * 12));
        double TotalPayment = MonthlyPayment * years * 12;
        System.out.printf("%-4.2f%s%-4.2f%n", MonthlyPayment, "  ", TotalPayment);
        System.out.println();
        System.out.println("Payment#" + "\t" + "Interest" + "\t\t\t" + "Principal" + "\t\t\t" + "Balance");
        double balance = loan;
        for(int i = 1 ;i <= years * 12; i ++){
            double Interest = (InterestRate / 1200) * balance;
            double principal = MonthlyPayment - Interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + Interest + "\t\t" + principal + "\t\t" + balance);
        }
    }
}
