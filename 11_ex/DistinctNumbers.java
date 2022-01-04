package 第十一章例题;
import java.util.*;
public class DistinctNumbers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     ArrayList<Integer>list = new ArrayList<>();
     
     Scanner input = new Scanner (System.in);
     System.out.println("Enter integers   (input ends with 0): ");
     int value;
     do {
    	 value = input.nextInt();
    	 if(!list.contains(value)&&value!=0)
    		 list.add(value);
    	 
     }while(value!=0);
     
     for (int i=0;i<list.size();i++)
    	 System.out.print(list.get(i) + " ");
	}

}
