package Abstraction;

import java.security.DomainCombiner;

interface Demo2{
String name="TVS";
int speed=100;
String  key();
String stop();
}
public class Interface_Ex implements Demo2{
public String key() {
	return "Start Bike";
}
public String stop() {
	return "Close Is Bike";
}
	public static void main(String[] args) {
		Interface_Ex i=new Interface_Ex();
     String a=i.key();
    String b= i.stop();
    System.out.println(name);
     System.out.println(speed);
     System.out.println(a);
     System.out.println(b);
	}
}
