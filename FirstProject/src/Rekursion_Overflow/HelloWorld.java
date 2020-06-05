package Rekursion_Overflow;

public class HelloWorld {

	public static void main(String[] args) {
		
		//Rekursion = Funktionen die sich selber aufrufen 
		
		//5! = 5*4*3*2*1
		//5! = 5*4!
		
		long[] fibos = new long [100];
		for(int i = 1; i < 100; i++)
		{
			if(fibos[i] == 0)
			{
				fibos[i] = fibo(i, fibos);
			}
		}
		System.out.println(fibos[50]);
	}
	
	public static long fibo(int n, long[] fibos)
	{
		//fib n = fib (n-1) + fib (n-2)
		if(n == 1)
		{
			return 1;
		}
		if(n == 0)
		{
			return 0;
		
		}
		if(fibos[n-1] == 0)
		{
			fibos[n-1] = fibo(n-1, fibos);
		}
		if(fibos[n-2] == 0)
		{
			fibos[n-2] = fibo(n-2, fibos);
		}
		return fibos[n-1] + fibos[n-2];
	}
}
