package Abstraction;
interface Employee2{
	String name(int a);
}
class Employee3 implements Employee2{
	public String name(int a) {
		return "Silent Boy";
	}
}
public class Interface1 {
	public static void main(String[] args) {
	Employee3 e=new Employee3();
	String employee1= e.name(1);
	System.out.println(employee1);
	}
}
