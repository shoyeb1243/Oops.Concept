package Constructor_Program;

public class PrivateConstructor {
int a,b;
private PrivateConstructor() {
	a=10;b=20;
	System.out.println(a+b);
}
private PrivateConstructor(int a,String b) {
	System.out.println(a+" "+b);
}
public static void main(String[] args) {
	PrivateConstructor p=new PrivateConstructor(20,"Java");
	PrivateConstructor s=new PrivateConstructor();
	}

}
