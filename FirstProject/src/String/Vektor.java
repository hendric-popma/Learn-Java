package String;

public class Vektor {
	int x;
	int y;
	int z;
	
	public Vektor() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	public Vektor(int x) {
		this.x = x;
		this.y = 0;
		this.z = 0;
	}
	public Vektor(int x, int y) {
		this.x = x;
		this.y = y;
		this.z = 0;
	}
	public Vektor(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vektor add(Vektor a)
	{
		Vektor ret = new Vektor();
		ret.x = a.x + this.x;
		ret.y = a.y + this.y;
		ret.z = a.z + this.z;
		
		return ret;
	}
	
	public String toString()
	{
		return "x= " + this.x + " and y = " + this.y + " and z = "+ this.z;
	}
}
