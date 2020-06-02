package Interfaces;

public class Tier implements Lebewesen {
	int beine;
	String name;
	int augen;
	
	public String machDichBemerktbar()
	{
		return "hey";
	}

	@Override
	public void atme() {
		System.out.println("Schnauf");
		
	}

}
