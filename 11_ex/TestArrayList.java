package ��ʮһ������;
import java.util.ArrayList;
public class TestArrayList {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//create a list to store cities
		ArrayList<String>cityList = new ArrayList<>();
		
		//add some cities in the list
		cityList.add("London");
		
		cityList.add("Denver");
		
		cityList.add("Paris");
		
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("Is Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		
		cityList.add(2,"Xian");
		
		cityList.remove("Miami");
		
		//remove a city at index 1
		cityList.remove(1);
		
		System.out.println(cityList.toString());
		
		for (int i = cityList.size()-1;i>=0;i--) 
			System.out.println(cityList.get(i)+ " ");
		System.out.println();
		ArrayList<Circle> list = new ArrayList<>();
		
		list.add(new Circle(2));
		list.add(new Circle(3));
		
		System.out.println("The area of the circle? " + list.get(0).getArea());
		
		
		

		
	}

}