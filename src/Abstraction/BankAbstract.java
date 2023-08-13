package Abstraction;
import java.util.Scanner;
abstract class Animal{
	public void Lags() {
		System.out.println("4 lags");
	}
		abstract void eat();
		abstract void sound();
}
public class BankAbstract extends Animal {
	public void eat() {
		System.out.println("Grass");
	}
	public void sound() {
		System.out.println("Bhokna");
}
	public static void main(String[] args) {
		BankAbstract bankAbstract=new BankAbstract();
		bankAbstract.Lags();
		bankAbstract.eat();
		bankAbstract.sound();
}
}