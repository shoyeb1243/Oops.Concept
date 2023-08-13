package Encapsulation;
class Voter1 extends Exception{
	private int age;
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() throws Exception{
		if(age>=18) {
			System.out.println("You Are Eligible For Vote");
		}
		else {
			throw new Exception("Not Eligible For Vote");
		}
		return age;
	}
}
public class Encapsulaction3 {

	public static void main(String[] args) throws Exception {
Voter1 v=new Voter1();
v.setAge(18);
System.out.println(v.getAge());
	}

}
