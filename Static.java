
package newmca;

import java.io.IOException;
import java.util.*;
class Static {
    //public static void main(String args[])
    //{
        
   /* try
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name ");
        String[] str =new String[sc.nextInt()];
       
       
       for(int i=0;i>str.length;i++)
       
       {
           str[i]=sc.nextLine();
         System.out.println("\n"+str);  
       }
    } 
        catch(Exception e)
        {
           out.print(e); 
        }*/
     /*   Scanner sc = new Scanner(System.in);  
        System.out.print(" enter the number of strings you want to print: ");
        
        String[] string = new String [sc.nextInt()];      
        sc.nextLine();   
        for (int i = 0; i < string.length; i++)   
        {  
            string[i] = sc.nextLine();  
        }  
        System.out.println("\n You have entered: ");  
        for(String str: string)   
        {  
            System.out.println(str);  
        }  
        
        public static void main (String str[]) throws IOException {
      Scanner sc = new Scanner (System.in);
      System.out.println ("Enter values up to  100 values, " +
      "enter a negative number to quit");
      //int array[] = new int [100];
      String[] string=new String[sc.nextInt()];
      sc.nextInt();
            
      
      for (int i=0; i< string.length; i++)
      {
        string[] = sc.nextInt();

        if (string[i] < 0)
        {
          break;
        }

      }

      for (int i =0; i<string.length; i++)
      {
        System.out.println(string[i]);
      }
*/
    
    public static void main (String str[]) throws IOException {
        
        
        
      Scanner scan = new Scanner (System.in);
      int array[] = new int [100];

      System.out.println ("Enter values up to  100 values, " +
      "enter a negative number to quit");
      for (int i=0; i< array.length; i++)
      {
        array[i] = scan.nextInt();

        if (array [i] < 0)
        {
          break;
        }

      }

      for (int i =0; i<array.length; i++)
      {
        System.out.println(array[i]);
      }

    }
}
