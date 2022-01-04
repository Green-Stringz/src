public class TestPassObject9_ex10 {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        int n = 5;
        printAress(myCircle, n);
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAress(Circle c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times --;
        }
    }
}
