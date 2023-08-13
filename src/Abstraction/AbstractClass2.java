package Abstraction;
abstract class Bike3{
	abstract String run();
}
class Honda2 extends Bike3{
	 String run() {
		 return "Honda Bike Is Running:";
	 }	
}
class TVS2 extends Bike3{
	String run() {
		return "TVS Bike Is Running:";
	}
}
public class AbstractClass2 {
	public static void main(String[] args) {
		TVS2 t=new TVS2();
		String tvs2=t.run();
		Honda2 h=new Honda2();
		String honda2=h.run();
		System.out.println(honda2+"\n"+tvs2);
	}
}
