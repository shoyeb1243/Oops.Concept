package Abstraction;
abstract class Wood2{
	abstract String belan();
	abstract String door();
	abstract String window();
    abstract String bed();
    abstract String chauki();
    String a() {
    	return "";
    	
    }
}
class Wood1 extends Wood2{
public String belan() {
	return "Belan";
}
public String door() {
	return "door";
}
public String window() {
	return "Window";
}
public String bed() {
	return "Bed";
}
public String chauki() {
	return "Chauki";
}
}
public class AbstractClass1 {
	public static void main(String[] args) {
Wood1 wood1=new Wood1();
String bString= wood1.belan();
String dString= wood1.door();
String wString= wood1.window();
String bString2= wood1.bed();
String cString= wood1.chauki();
System.out.println(bString+"\n"+dString+"\n"+wString+"\n"+bString2+"\n"+cString);
	}

}
