package Abstraction;
interface Bike1{
	String tvs();
}
interface Fourwheelar{
	String bolero();
}
class Vehicel implements Bike1,Fourwheelar{
	@Override
	public String tvs() {
		return "TVS Is Bike :";
	}
	@Override
	public String bolero() {
		return "Bolero Is Fourwheelar :";
	}
}
public class Interfaces {
	public static void main(String[] args) {
		Vehicel v=new Vehicel();
		String vehicel=v.tvs();
		String vehicel2= v.bolero();
		System.out.println(vehicel+"\n"+vehicel2);
	}

}
