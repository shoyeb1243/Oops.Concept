package ThisKeyWord_Program;

public class ParameterizedConstructor {
	ParameterizedConstructor(){
		this(100);
		System.out.println("Non Parameterized.");
	}
	ParameterizedConstructor(int a){
		System.out.println("Parameterized->"+a);
	}
	public static void main(String[] args) {
		ParameterizedConstructor p=new ParameterizedConstructor();
	}

}
