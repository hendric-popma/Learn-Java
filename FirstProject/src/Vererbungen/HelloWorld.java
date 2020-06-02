package Vererbungen;

public class HelloWorld {

	public static void main(String[] args) {
		Tier t = new Hund();
		Hund h = (Hund)t;
				
		System.out.println(t.machDichBemerktbar());

	}

}
