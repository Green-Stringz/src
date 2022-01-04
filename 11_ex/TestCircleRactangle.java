package 第十一章例题;

public class TestCircleRactangle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Circle circle = new Circle(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The perimeter is " + circle.getPerimerter());
		
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is "+ rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());


		
	}

}
