package SuperKeyWord_Program;
class Demo3{
	void m1() {
		System.out.println("Hello");
	}
}
public class MethodSuper_Ex extends Demo3 {
void m1() {
	super.m1();
	System.out.println("Bye");
}
	public static void main(String[] args) {
		MethodSuper_Ex m=new MethodSuper_Ex();
		m.m1();
	}

}
