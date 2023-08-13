package ThisKeyWord_Program;

public class DefaultConstructor_Ex {
	int a=20;
	DefaultConstructor_Ex(){
		System.out.println(a);
	}
	DefaultConstructor_Ex(int a){
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		DefaultConstructor_Ex d=new DefaultConstructor_Ex(100);
	}

}
