package PolyMorphisam;
class Demo{
	int m1() {
		System.out.println("1");
		return 0;
	}
	Object m1(int a) {
		System.out.println("2");
		return 0;
	}
	String m1(int a,int b) {
		System.out.println("3");
		return "";
	}
}
public class OverLoading2 {
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.m1();
		demo.m1(0);
		demo.m1(1,2);
	}

}
