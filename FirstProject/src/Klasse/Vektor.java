package Klasse;

public class Vektor {
	int x;
	int y;
	int z;
	
	public Vektor add(Vektor a)
	{
		Vektor ret = new Vektor();
		ret.x = a.x + this.x;
		ret.y = a.y + this.y;
		ret.z = a.z + this.z;
		
		return ret;
	}
}
