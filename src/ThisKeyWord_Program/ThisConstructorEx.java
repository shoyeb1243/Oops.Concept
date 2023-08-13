package ThisKeyWord_Program;

public class ThisConstructorEx {
	void m1() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisConstructorEx t=new ThisConstructorEx();
		System.out.println(t);
		t.m1();
	}

}
