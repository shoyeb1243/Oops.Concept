package PolyMorphisam;
class City{
	String mumbai(int a) {
		return "Saki Naka";
	}

	String mumbai(int a,int b) {
		return "Mumbra";
	}
	String mumbai(int...a) {
		return "Bhandup";
	}
}
public class OverLoading {

	public static void main(String[] args) {
		City c= new City();
		String city=c.mumbai(1);
		String city2=c.mumbai(1,2);
		String city1=c.mumbai(1,3,4,3,3,33);
		System.out.println(city+"\n"+city1+"\n"+city2);
	}

}
