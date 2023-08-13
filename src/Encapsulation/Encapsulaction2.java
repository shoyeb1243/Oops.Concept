package Encapsulation;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Voter extends Exception{
	

	private static final long serialVersionUID = 1L;
	private int age;
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() throws Exception{
		if(age>=18) {	
			System.out.println("your are eligible");
			 
		}
		else {
			throw new Exception("exception your age is " + age + " it is invalid ");
		}
		return age;
}
}
public class Encapsulaction2{
	public static void main(String[] args) throws Exception {
		Voter voter=new Voter();
		System.out.println("Enter your age");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int age=Integer.parseInt(br.readLine());
		voter .setAge(age);
		System.out.println(voter.getAge());
	}
}
