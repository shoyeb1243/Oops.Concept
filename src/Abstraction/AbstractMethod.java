package Abstraction;
abstract class Bike{
abstract void run();
}
class Hero extends Bike{
	public void run() {
		System.out.println("Bike Is Running");
	}
}
class Pro extends Bike{
	public void run() {
		System.out.println("Bike Is Racing");
	}
}
public class AbstractMethod {
	public static void main(String[] args) {
		Hero hero=new Hero();
		hero.run();	
Pro pro=new Pro();
pro.run();
	}
}