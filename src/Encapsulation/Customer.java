package Encapsulation;
import java.util.Scanner;
class SBIBank{
	private double baln=5000;
	private int password;
	public void deposite(double money) {
		System.out.println("Enter Your Password");
		Scanner sc=new Scanner(System.in);
		password=sc.nextInt();
		if(password==1243) {
				baln=baln+money;
				System.out.println("Deposite Money->"+money);
				System.out.println("Total Baln->"+baln);
			}
			else {
				System.out.println("Incorrect Password");
			}
		}
	public void checkBaln(double money) {
		System.out.println("Enter Your Password");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==1243) {
			System.out.println("Total Baln->"+baln);	
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	public void withdrow(double money) {
		System.out.println("Enter Your Password");
		Scanner s1=new Scanner(System.in);
		password=s1.nextInt();
		if(password==1243) {
			System.out.println("Wihtdrow Money"+money);
			System.out.println("Total Baln"+baln);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
}
public class Customer {

	public static void main(String[] args) {
		SBIBank sb=new SBIBank();
	int a;
	System.out.println("1. Deposite");
	System.out.println("2. CheckBaln");
	System.out.println("3. Withdrow");
	System.out.println("\n Enter Your Choice");
	Scanner s2=new Scanner(System.in);
	a=s2.nextInt();
	switch(a) {
	case 1: sb.deposite(2000);
	break;
	case 2: sb.checkBaln(0);
	break;
	case 3: sb.withdrow(1000);
	default :
		System.out.println("Invailed");
	}
	}
}
