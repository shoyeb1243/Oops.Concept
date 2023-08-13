package PolyMorphisam;
class Polymorphisam{
	String compiletime(int a) {
		return "Compile Time";
	}
	String runtime(int a ,int b) {
		return "Run Time";
	}
}
class Oops extends Polymorphisam{
	String compiletime(int a) {
		return "Static Binding";
	}
	String runtime(int a,int b) {
		return "Dynamic Binding";
	}
}
public class Overriding {
	public static void main(String[] args) {
		Oops o=new Oops();
		String oops=o.compiletime(1);
		String oops1 = o.runtime(2, 3);
		System.out.println("1->"+oops+"\n2->"+oops1);

	}

}
