import java.util.Scanner;

public class NearPoints {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoint = input.nextInt();

        double[][] points = new double[numberOfPoint][2];
        System.out.print("Enter " + numberOfPoint + " points: ");
        for (int i = 0; i < points.length; i ++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortesDistances = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        int[][] indices = new int[points.length][2];
        int k = 0;

        for (int i = 0; i < points.length; i ++){
            for (int j = i + 1; j < points.length; j ++){
                double distance = distance(points[i][0]), points[i][1], points[j][0], points[j][1]);
                if (distance < shortesDistances) {
                    k = 0;
                    indices[k][0] = i;
                    indices[k][1] = j;
                    shortesDistances = distance;
                }
                else if (distance == shortesDistances) {
                    indices[k][0] = i;
                    indices[k][1] = j;
                    k ++;
                }
            }
        }

        for (int i = 0; i < k; i ++){
            p1 = indices[i][0]; p2 = indices[i][1];
            System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
        }
        System.out.println("Their distance is " + shortesDistances);
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
