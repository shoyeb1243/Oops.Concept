package Constructor_Program;

public class Block {
 static void m1() {
		System.out.println("Method");
	}
	Block(){
		System.out.println("Constructor");
	}
	static {
		
		System.out.println("Static Block");
	}
	{
		System.out.println("Inslaizer Block");
	}
	public static void main(String[] args) {
		Block b=new Block();
		Block.m1(); 

	}

}
