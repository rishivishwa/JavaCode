
public class sixtydegreepattern {
	public static void main(String args[])   
    {    
      		/*Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number of rows to be printed"); 
		int rows = sc.nextInt(); */

		for (int i = 0; i <= 7; i++) 
                { 
				i++;
			for (int j = 7; j >= i; j--) 
                        { 
				System.out.print(" "); 
			}  
			for (int j = 1; j <= i; j++) { 
				System.out.print("* "); 
			}  
			System.out.println(); 
		} 
	} 
}
