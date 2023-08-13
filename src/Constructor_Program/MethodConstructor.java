package Constructor_Program;

public class MethodConstructor {
	 void m1() {
		System.out.println("Hello");
	}
	MethodConstructor(){
		System.out.println("Hey");
	}
		public static void main(String[] args) {
	MethodConstructor m=new MethodConstructor();
	m.m1();
	}

}
