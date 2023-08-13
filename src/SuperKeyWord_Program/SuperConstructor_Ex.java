package SuperKeyWord_Program;
class D{
	int a; int b;
	D(){
	a=10;b=20;
System.out.println(a+b);
	}
}
public class SuperConstructor_Ex extends D {
	SuperConstructor_Ex(){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		SuperConstructor_Ex s=new SuperConstructor_Ex();
	}

}
