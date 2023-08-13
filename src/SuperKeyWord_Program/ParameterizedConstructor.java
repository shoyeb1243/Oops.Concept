package SuperKeyWord_Program;
class Demo5{
	Demo5(int a){
		System.out.println("Total -> "+a);
	}
}
public class ParameterizedConstructor extends Demo5 {
	ParameterizedConstructor(int a){
		super(100);
		System.out.println("Yes");
	
	}
	public static void main(String[] args) {
		ParameterizedConstructor p=new ParameterizedConstructor(10);

	}

}
