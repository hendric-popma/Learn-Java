
public class MethodenUeberladen {

	public static void main(String[] args) {
		System.out.println(plus(5,3));
		System.out.println(plus(5,3,6));
	}
	private static int plus(int a, int b)
	{
	
		return a+b;
	
}
private static int plus(int a, int b ,int c)
{
	
	return a+b+c;
}
private static double plus(double a, double b)
{
	return a+b;
}
}
