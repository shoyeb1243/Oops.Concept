package Abstraction;

import java.util.Scanner;

interface Employee{
	void input();
	void output();
}
public class InterfaceEx implements Employee {
	String name; Double salary;
	public void input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Name->");
		name=scanner.nextLine();
		
		System.out.println("Enter Your Salary->");
		salary=scanner.nextDouble();
	}
public void output() {
	System.out.println("Name->"+name+"\nSalary->"+salary);
}
	public static void main(String[] args) {
		InterfaceEx interfaceEx=new InterfaceEx();
		interfaceEx.input();
		interfaceEx.output();
		
	}

}
