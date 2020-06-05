package Klassenkonvektionen;

public abstract class Tier implements Lebewesen {
	int beine;
	
	public void setBeine(int beine) {
		if(beine < 0)
		{
			this.beine = 0;
			return;
		}
		this.beine = beine;
	}
	public int getbeine()
	{
		return beine;
	}
	
	public String machDichBemerktbar()
	{
		return "hey";
	}
	public abstract void laufe();


}
