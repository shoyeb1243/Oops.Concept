package Abstraction;
abstract class Wood{
	abstract String door();
	abstract String belan();
}
class Demo extends Wood{
	@Override
	String door() {
		return "door";
	}

	@Override
	String belan() {
		return "belan";
	}
}
public class Abstract {

	public static void main(String[] args) {
	Demo demo=new Demo();
	String aString= demo.belan();
	String b= demo.door();
	System.out.println(aString+"\n"+b);
	
	}

}
