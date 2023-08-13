package Encapsulation;

import java.util.Scanner;

class Demo{
	private int balance=2000;
	private int password;
	public void deposite(int money) {
		System.out.println("Enter Your Password");
		Scanner scanner=new Scanner(System.in);
		password= scanner.nextInt();
		if(password==1243) {
			balance=balance+money;
			System.out.println("Enter Money->"+money);
			System.out.println("Toatal Balance->"+balance);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	public void withdraw(int money) {
		System.out.println("Enter Your Password");
		Scanner sc=new Scanner(System.in);
		password=sc.nextInt();
		if(password==1243) {
			balance=balance-money;
			System.out.println("Enter Withdraw Money->"+money);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
		public void balance(double money) {
			System.out.println("Enter Your Password");
			Scanner scanner=new Scanner(System.in);
			password=scanner.nextInt();
			if (password==1243) {
				System.out.println("Check Balance-->"+balance);
			}
		}
}
public class Encapsulaction_Ex1 {
	public static void main(String[] args) {
	Demo demo=new Demo();
	int a;
	System.out.println("1. Deposite");
	System.out.println("2. WithDraw");
	System.out.println("3 Check Balance");
	System.out.println("\nEnter Your Choice");
	Scanner scanner=new Scanner(System.in);
	a=scanner.nextInt();
	switch (a) {
	case 1:
		demo.deposite(1000);
		break;
	case 2:
		demo.withdraw(500);
		break;
	case 3:
		demo.balance(3000);
		break;
	default:
		System.out.println("Invalid.");
		break;
	}
	}

}
