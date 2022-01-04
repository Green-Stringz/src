public class TrianglePerimeter {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter three edges (length in double): ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        boolean isVaild = (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);
        if (isVaild){
            System.out.println("The perimeter is " + (edge1 + edge2 + edge3));
        }
        else{
            System.out.println("Input is invalid");
        }
    }
}
