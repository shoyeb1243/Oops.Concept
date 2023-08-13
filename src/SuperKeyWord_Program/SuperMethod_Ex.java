package SuperKeyWord_Program;
class C{
	void m1() {
		System.out.println("Hello");
	}
}
public class SuperMethod_Ex extends C {
	void m1() {
		super.m1();
		System.out.println("Hey");
		super.m1();
	}
	public static void main(String[] args) {
		SuperMethod_Ex s=new SuperMethod_Ex();
		s.m1();

	}

}
