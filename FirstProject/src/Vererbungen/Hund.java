package Vererbungen;

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
	
}
