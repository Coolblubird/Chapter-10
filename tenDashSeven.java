import java.util.*;
import javax.accessibility.*;


//Jordan Ashe 03-23-21
class tenDashSeven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		accounts[0] = new Account(0, 100.0);
		accounts[1] = new Account(1, 100.0);
		accounts[2] = new Account(2, 100.0);
		accounts[3] = new Account(3, 100.0);
		accounts[4] = new Account(4, 100.0);
		accounts[5] = new Account(5, 100.0);
		accounts[6] = new Account(6, 100.0);
		accounts[7] = new Account(7, 100.0);
		accounts[8] = new Account(8, 100.0);
		accounts[9] = new Account(9, 100.0);
		int mode = 0;
		int id = 10;
		double temp = 0.0;
		
		while (true){
			mode = 0;
			System.out.println("ATM Machine: Please Enter your ID: ");
			id = input.nextInt();
			while (mode!=4){
				if (id<0 || id>9){
					System.out.println();
					System.out.println("Please enter a valid ID, if this is incorrect, please contact the administrators of this device.");
					System.out.println();
				}
				else{
					System.out.println();
					System.out.println("1) Viewing the balence of this ID.");
					System.out.println("2) Withdraw money from this balence.");
					System.out.println("3) Deposit money into this balence.");
					System.out.println("4) Exit");
					System.out.print("Please enter the mode you would like to access: ");
					mode = input.nextInt();
					
					if (mode == 1) {
						System.out.println();
						System.out.println("The balence of this ID is currently " + accounts[id].getBalance());
						System.out.println();
					}
					
					if (mode == 3) {
						System.out.println();
						System.out.print("The balence of this ID is currently " + accounts[id].getBalance() + ", please enter the amount you are adding: ");
						temp = input.nextDouble();
						accounts[id].deposit(temp);
						System.out.println();
					}
					
					if (mode == 2) {
						System.out.println();
						System.out.print("The balence of this ID is currently " + accounts[id].getBalance() + ", please enter the amount you are removing from the account: ");
						temp = input.nextDouble();
						accounts[id].withdraw(temp);
						System.out.println();
					}
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}