package PolyMorphisam;
class Demo1{
   Object m1() {
		System.out.println("yes");
		return 0;
		
	}
}
class Over extends Demo1 {
		String m1() {
			super.m1();
			System.out.println("no");
		return "";
		}
}
public class Overriding1{
		public static void main(String[] args) {
			Demo1 demo=new Over();
			demo.m1();
	}
}
