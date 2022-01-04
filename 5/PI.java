import java.util.Scanner;
public class PI {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        double sum = 0;
        for(int i = 1;i <= n; i ++){
            sum += (double)(Math.pow((-1), (i + 1)) / (2 * i - 1));
        }
        System.out.println((double)(4 * sum));
    }
}
