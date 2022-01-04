package 第十一章两星练习题;

public class 十一_八 {

	public static void main(String[] args)  {
			Account customer= new Account("George",1122,1000.0);
			customer.setannualInterstRate(1.5);
			customer.withDraw(30);
			customer.withDraw(40);
			customer.withDraw(50);
			customer.deposit(5);
			customer.deposit(4);
			customer.deposit(2);
			System.out.println("账户姓名：" + customer.name+"\n"+ "账户id：" + customer.getid());
			System.out.println("                  时间              操作      金额     账户余额");
			while(!customer.transactions.isEmpty()) {
				Transaction temp = customer.transactions.remove(0);
				temp.pt();
			}
		}
	

}
