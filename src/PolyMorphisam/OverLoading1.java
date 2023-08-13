package PolyMorphisam;
class Java{
	String Opps() {
		return "Inheritance";
	}
  String Opps(String a){
	 return "Polymorphisam";
	}
 String Opps(String a,String b) {
	 return "Incapsulation"; 
 }
 String Opps(String a,String b,String c ) {
	 return "Abstraction";
 }
}
public class OverLoading1 {
	public static void main(String[] args) {
		Java j=new Java();
		String java1=j.Opps();
		String java2= j.Opps("");
		String java3=j.Opps("","");
		String java4=j.Opps("","","");
		System.out.println("1->"+java1+"\n2->"+java2+"\n3->"+java3+"\n4->"+java4);
	}
}
