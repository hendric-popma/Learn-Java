
public class BooleanIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition; 
        condition = false;
        boolean condition2 = true;
        
        
        if(condition)
        {
            System.out.println("Die Aussage ist war wahr.");
        }
        else if (condition2)
        {
        System.out.println("Die Aussage 2(!) war wahr");
        }
        else
        {
            System.out.println("Die Aussage war falsch");
        }
            
            
           
            boolean bool = 5 > 2;
            bool = 5 > 2 && 2 < 1;
            
            if(bool)
            {
                System.out.println("eins davon war wahr");                
            }

	}

}
