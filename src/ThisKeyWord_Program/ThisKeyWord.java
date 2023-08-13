package ThisKeyWord_Program;

public class ThisKeyWord {
int a;
ThisKeyWord(int a) {
	this.a=a;
	}
void m1() {
	System.out.println(a);
}

	public static void main(String[] args) {
		ThisKeyWord t=new ThisKeyWord(100);
		t.m1();
	}
	}