import java.util.Scanner;
public class PyramidDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of line");
        int a = input.nextInt();
        for(int i = 1; i <= a; i ++) {
            for(int j = (a-i) * 3-1; j >= 0; j --) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j --) {
                if(j < 10)
                    System.out.print("  ");
                else
                    System.out.print(" ");
                System.out.print(j);
            }
            for(int j = 2; j <= i; j ++) {
                if(j < 10)
                    System.out.print("  ");
                else
                    System.out.print(" ");
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
