package 第十一章两星练习题;
import java.util.*;
//本题我运用了类的方法进行操作，因为Integer类型存放在ArrayList中时，
//相同的数字无法再次存放，因此我将每个数字转换成String再加一个后缀，这样就可以避免问题了
public class 十一_十九 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of the objects: ");
      int number = input.nextInt();
      ArrayList<String> I = new ArrayList<String>();
      System.out.print("Enter the weights of the jects: ");
      int numofct = 1;
      container c = new container(); 
      for(int i=0;i<number;i++) {
    	  int weight = input.nextInt();
    	  I.add(""+weight+i);
      }
      while(!I.isEmpty()) {
      for(int i=0;i<number;i++) {
    	  int weight  = Integer.valueOf(""+I.get(i))/10;
    	  if(c.reduce(weight)==1) {
    		  I.remove(i);
    		 number--;
    		  i=-1;
    	  }
    	  
    	  
      }
	  System.out.printf("Container %d contains objects with weight ",numofct++);
      c.pt();
      System.out.print("\n");
      c.set();
      
      }
      
	}

}
class container{
	private int capicity=10;
	public ArrayList<String> list = new ArrayList<String>();
	public container() {
		
	}
	public  int reduce(int weight) {
		this.capicity-=weight;
		if(this.surplus()>=0) {
			this.list.add(""+weight+this.list.size());
			return 1;
		}
		else {
			this.capicity+=weight;
			
			return 0;
		}
	}
	public  int surplus() {
		return this.capicity;
		
	}
	public void set() {
		this.capicity = 10;
	}
	public void pt() {
		
		while(!this.list.isEmpty()) {
			System.out.print(Integer.valueOf(this.list.remove(0))/10+" ");
			
		}
	}
}
