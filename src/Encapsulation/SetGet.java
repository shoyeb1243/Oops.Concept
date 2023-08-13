package Encapsulation;
class Demo7{
	private int id;
	private String name;
public void setId(int a) {
	id=a;
}
public int getId() {
	return id;
}
public void setName(String a) {
	name=a;
}
public String getName() {
	return name;
}
}
public class SetGet {
	public static void main(String[] args) {
	Demo7 demo=new Demo7();
	demo.setId(101);
	demo.setName("Silent Boy");
System.out.println("Id->"+demo.getId()+"\nName->"+demo.getName());
	
	}

}
