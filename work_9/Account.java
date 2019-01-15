import java.util.Date;
class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	Account(){
		dateCreated = new Date(System.currentTimeMillis());
	}
	Account(int id,double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date(System.currentTimeMillis());
	}
	void setId(int id){
		this.id = id;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
	void setAnnualInterstRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	int getId(){
		return id;
	}
	double getBalance(){
		return balance;
	}
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	String dateCreated(){
		return dateCreated.toString();
	}
	double getMonthlyInterestrate(){
		return annualInterestRate / 12;
	}
	double getMonthlyInterest(){
		return balance * (this.getMonthlyInterestrate() / 100);
	}
	void withDraw(double balance){
		this.balance -= balance;
	}
	void deposit(double balance){
		this.balance += balance;
	}
}