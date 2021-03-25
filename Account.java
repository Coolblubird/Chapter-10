import java.util.*;

//Jordan Ashe 03-19-21
//account class set
public class Account{
	private int id;
	private double balance;
	private double air;
	private Date dateCreated = new Date();
		
	//base constructor
	Account() {
		id=0;
		balance=0.0;
		air=0.0;
	}
		
	//if a new set is given for the constructor
	Account(int newID, double b) {
		id=newID;
		balance=b;
		air=0.0;
	}

	//self explanitory
	double getID() {
		return id;
	}
	
	//self explanitory
	void setID(int newID) {
		id = newID;
	}
	
	//self explanitory
	double getBalance() {
		return balance;
	}
	
	//self explanitory
	void setBalance(double newBalance) {
		balance = newBalance;
	}
		
	double getAIR(){
		return air;
	}
	
	void setAIR(double newAIR){
		air = newAIR;
	}
	
	Date getDateCreated(){
		return dateCreated;
	}
	
	double getMonthlyInterestRate(){
		return air / 100 / 12;
	}
	
	double getMonthlyInterest(){
		return balance * (air / 100 /12);
	}
	
	void withdraw(double amount){
		balance -= amount;
	}
	
	void deposit(double amount){
		balance += amount;
	}
}

