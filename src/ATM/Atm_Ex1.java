package ATM;
import java.util.Scanner;
class Atm{
	 double balance;
	int pin=1243;
	public void checkPin() {
		System.out.println("Enter your Pin");
		Scanner s=new Scanner(System.in);
		int enteredpin=s.nextInt();
		if(enteredpin==pin) {
			menu();
		}
		else {
			System.out.println("Enter a vailed Pin");
			System.out.println("Please Enter Correct Pin");
		}
	}
	public void menu() {
		System.out.println("Enter You Choice");
		System.out.println("1. Check Blence");
		System.out.println("2. Withdraw Blence");
		System.out.println("3. Deposite Blence");
		System.out.println("4. Exit");
		Scanner s= new Scanner(System.in);
		int opction=s.nextInt();
		if(opction==1) {
			checkbalance();
		}
		else if (opction==2) {
			withdrawbalance();
			
		}
		else if (opction==3) {
			depositebalance();
			
		}
		else if (opction==4) {
			return;	
		} 
		else {
			System.out.println("Enter a vailed choice");
		}
		}
	public  void checkbalance() {
	System.out.println("Balance->"+balance);
	menu();
	}
	public  void withdrawbalance() {
		System.out.println("Enter Amount to Withdraw");
		Scanner s=new Scanner(System.in);
		 float amount=s.nextFloat();
		 if(amount>balance) {
			 System.err.println("Insufficint Balance");
		 }
		 else {
			 balance=balance-amount;
			 System.out.println("Money Withdraw Successful");
			
		 }
		 menu();
	}	
	public void depositebalance() {
	System.out.println("Enter You Balance");
	Scanner s=new Scanner(System.in);
	int amount=s.nextInt();
	System.out.println();
	balance=balance+amount;
	System.out.println("Money Deposite Seccessful");
		menu();
	}
}
public class Atm_Ex1 {

	public static void main(String[] args) {
		Atm atm=new Atm();
atm.checkPin();
	}

}
