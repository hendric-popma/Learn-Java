package String;

public class HelloWorld {

	public static void main(String[] args) {
		//kein i
		int i = 5;
		//i=5
		i = 1;
		// ab hier ist i=1
		Vektor v = new Vektor(5,4);
		Vektor v2 = new Vektor(1,2,3);
		v.x = 1;
		v.y = 0;
		v.z = 0;
		
		
		Vektor v3 = v.add(v2);
		
		System.out.println(v3.toString());
				
	}

}
