package SuperKeyWord_Program;
class Demo4{
	Demo4(){
		System.out.println("Hello");
	}
}
public class ConstructorSuper_Ex extends Demo4 {
	ConstructorSuper_Ex(){
		System.out.println("bye");
	}
	public static void main(String[] args) {
		ConstructorSuper_Ex c=new ConstructorSuper_Ex();
	}

}
