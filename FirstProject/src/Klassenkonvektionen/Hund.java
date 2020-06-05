package Klassenkonvektionen;

public class Hund extends Tier{
	String rasse = "dalmatiner";
	
	public String gibRassezurück()
	{
		return rasse;
	}
	
	public String machDichBemerktbar()
	{
		return "wau";
	}
	
	public void atme()
	{
		System.out.println("hechel");
	}
	
	public void laufe() {
		System.out.println("hüpf");
	}
}
