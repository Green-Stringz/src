import java.util.Scanner;
public class ISBN_10Check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first 9 digits of an ISBN as integer : ");
            int m = sc.nextInt();
            int d1 = m / 10 / 10000000 % 10;
            int d2 = m / 10000000 % 10;
            int d3 = m / 1000000 % 10;
            int d4 = m / 100000 % 10;
            int d5 = m / 10000 % 10;
            int d6 = m / 1000 % 10;
            int d7 = m / 100 % 10;
            int d8 = m / 10 % 10;
            int d9 = m % 10;
            int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4
                    + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
            if (d10 == 10)
                System.out.println("The ISBN -10 number is " + d1 + (m - d1) + "X");
            else
                System.out.println("The ISBN -10 number is " + d1 + (m - d1) + d10);
        }
    }
}
