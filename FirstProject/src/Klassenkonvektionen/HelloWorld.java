package Klassenkonvektionen;

public class HelloWorld {

	public static void main(String[] args) {
		Hund t = new Hund();
		t.setBeine(4);
		t.atme();
		Lebewesen l = new Fisch();
		l.atme();
		
		Lebewesen[] ls = new Lebewesen[10];
		for(int i = 0; i <10; i++)
		{
			ls[i] = new Fisch();
		}
		
		ls[5] = new Hund();
		ls[4] = new Hund();
		
		for(int i = 0; i <10; i++)
		{
			ls[i].atme();
		}
		

	}

}
