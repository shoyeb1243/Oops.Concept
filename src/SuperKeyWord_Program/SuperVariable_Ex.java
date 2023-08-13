package SuperKeyWord_Program;
class A{
	int a=20;int b=30;
}
class B extends A{
	int a=40;int b=20;
	void m1() {
		System.out.println(super.a+super.b);
		System.out.println(a+b);
	}
}
public class SuperVariable_Ex {
	public static void main(String[] args) {
	B c=new B();
	c.m1();

	}

}
