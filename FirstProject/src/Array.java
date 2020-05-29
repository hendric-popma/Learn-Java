
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] asdf = new int[10];
		int[] wasd = new int[5];
		
		for(int zaehler = 0; zaehler < 10; zaehler++)
		{
			asdf[zaehler] = zaehler + 5;
			wasd[zaehler] = asdf[zaehler] * 12;
					
		}
		for(int i = 0; i < 10; i++)
		
			System.out.println(asdf[i] * wasd[i % 5]);
		//modolo = %

	}
	   
}
