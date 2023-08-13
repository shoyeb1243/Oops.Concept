package Constructor_Program;
public class DefaultConstructor {
	public static void main(String[] args) {
Demo1 d=new Demo1();
Demo1 e=new Demo1(20,"JavaTPoint");
	}

}
class Demo1{
	int a; String b;
	Demo1(){
		a=10; b="Java";
		System.out.println(a+" "+b);
	}
	Demo1(int a,String b){
	
		System.out.println(a+" "+b);
}
}

