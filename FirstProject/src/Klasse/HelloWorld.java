package Klasse;

public class HelloWorld {

	public static void main(String[] args) {
		
		Vektor v = new Vektor();
		Vektor v2 = new Vektor();
		v.x = 1;
		v.y = 0;
		v.z = 0;
		v2.x = 1;
		v2.y = 0;
		v2.z = 0;
		
		Vektor v3 = v.add(v2);
				
	}

}
