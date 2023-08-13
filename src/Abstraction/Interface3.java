package Abstraction;
interface A{
	void m1() ;	
	}

interface B extends A{
	void m1();
}
public class Interface3 implements B {
	public void m1() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Interface3 interface3=new Interface3();
interface3.m1();
	}

}
