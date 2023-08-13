package Encapsulation;
class Emp{
	private int id;
	private String name;
	private String address;
	private double salary;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}
public class Encapsulaction1 {
	public static void main(String[] args) {
	Emp emp=new Emp();
	 emp.setId(101);
	 emp.setName("AbuZar");
	 emp.setAddress("Saki Naka");
	 emp.setSalary(50000);
	 System.out.println("Id->"+emp.getId()+"\nName->"+emp.getName()+"\nAddress->"+emp.getAddress()+"\nSalary->"+emp.getSalary());
	}

}
