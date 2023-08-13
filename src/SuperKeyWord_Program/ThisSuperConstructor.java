package SuperKeyWord_Program;
class Emp{
	int id;
	String name;
	Emp (int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	 int  m1() {
		System.out.println(id+"\n"+name);
		return id;
		
	}
}
public class ThisSuperConstructor extends Emp{
 
	ThisSuperConstructor(int id, String name) {
		super(id,name);
	}
	public static void main(String[] args) {
		Emp emp=new Emp(101,"SilentBoy");
		emp.m1();		
	}
}
