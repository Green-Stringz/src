import java.util.Scanner;
public class e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        double e = 1.0;
        double item = 1.0;
        for (int i = 1; i <= number; i ++) {
            item = item / i;
            e = e + item;
        }
        System.out.println("The e is " + e + " for i = " + number);
    }
}
