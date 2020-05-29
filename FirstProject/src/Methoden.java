
public class Methoden {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 20; j++)
			{
				System.out.println(plus(i, j));
			}
		}
	}
	private static int plus(int a, int b)
	{
		
		return a+b;
	}
}
