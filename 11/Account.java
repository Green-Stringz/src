package 第十一章两星练习题;
import java.util.*;
public class Account {

public ArrayList<Transaction> transactions = new ArrayList<Transaction>();	
public String name;
private int id=0;
private double balance =0;
private double annualInterestRate = 0.0;
private Date dateCreated = new Date();
public  Account(String name,int id, double balance) {
	this.name=name;
	this.id=id;
	this.balance=balance;
}
public  Account() {
	
}
public  Account(int id,double balance) {
	this.id=id;	
	this.balance=balance;
	
}

public int getid() {
return this.id;
}
public void setid(int id) {
	this.id=id;
}
public double getbalance() {
	return this.balance;
}
public void setbalance(double balance) {
	this.balance=balance;
}
public double getannualInterestRate() {
	return this.annualInterestRate;
}
public void setannualInterstRate(double annualInterestRate) {
	this.annualInterestRate=annualInterestRate;
}
public Date getdateCreated() {
	return this.dateCreated;
}
public double getMonthlyInterestRate() {
	return annualInterestRate/12.0;
}
public double getMonthlyInterest() {
 return this.balance*this.getMonthlyInterestRate();	
}
public void withDraw(double ed) {
  this.setbalance(this.balance-ed);	
  Date d = new Date();
  Transaction n = new Transaction (d,'W',ed,this.getbalance(),"取款",ed) ;
  this.transactions.add(n);
}
public void deposit(double ed) {
	this.setbalance(this.balance+ed);
	Date d = new Date();
	Transaction n = new Transaction (d,'D',ed,this.getbalance(),"存款",ed) ;
	  this.transactions.add(n);
}

}
class Transaction{
	private Date date= new Date() ;
	private char type;
	private double amount,balance;
	public double exchange;
	private String description;
	public  Transaction(Date date,char type, double balance, double amount,String description,double e ) {
	this.date=date;
	this.type=type;
	this.balance=balance;
	this.amount=amount;
	this.description=description;
	this.exchange = e ;
	}
	public void pt() {
		System.out.print(this.date);
		System.out.print(" "+ this.type);
		System.out.printf("  %s  %5.1f  %8.1f\n",this.description,this.exchange,this.amount);
		
	}
}


