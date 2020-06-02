package Interfaces;

public class HelloWorld {

	public static void main(String[] args) {
		Tier t = new Tier();
		t.atme();
		Lebewesen l = new Fisch();
		l.atme();
		
		Lebewesen[] ls = new Lebewesen[10];
		for(int i = 0; i <10; i++)
		{
			ls[i] = new Fisch();
		}
		
		ls[5] = new Hund();
		ls[4] = new Tier();
		
		for(int i = 0; i <10; i++)
		{
			ls[i].atme();
		}
		

	}

}
