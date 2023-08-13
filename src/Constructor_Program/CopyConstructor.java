package Constructor_Program;
class D{
	int a; String b;
	D(){
		a=10;b="Java";
		System.out.println(a+" "+b);
	}
	D(D d){
		a=d.a;
		b=d.b;
		System.out.println(a+" "+b);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
D e=new D();
D c=new D(e);
	}

}
