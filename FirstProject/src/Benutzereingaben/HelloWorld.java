package Benutzereingaben;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		BufferedReader blubb = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		
		try {
			input = blubb.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//code
		System.out.println("du wolltest also " + input);
		
		/* asdf
		 * wasd
		 * abcd
		 */
	}
	
}		