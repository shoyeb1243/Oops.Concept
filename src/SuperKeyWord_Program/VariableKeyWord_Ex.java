package SuperKeyWord_Program;
class Demo1{
	    Object show(String a) {
		System.out.println("hii");
		return a;
	}
}
public class VariableKeyWord_Ex extends Demo1 {
	/*
	 * int a=30; void m2() { System.out.println(super.a); System.out.println(a); }
	 */
	String show(String s) {
		System.out.println("byee");
		return s;
		
	}
	public static void main(String[] args) {
		 Demo1 a=new VariableKeyWord_Ex();
         a.show("aa");
	}
	
}

