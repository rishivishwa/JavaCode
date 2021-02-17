/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmca;
import java.util.*;

public class Rishikesh {
    
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name ");
       String string=sc.nextLine();
       
       
      /* for(int i=0;i>str.length;i++)
       
       {
         str[i]=sc.nextLine();
         System.out.println("\n"+str);  
       } */
       // System.out.println(str);
        int Count=string.length();
        Count=100 ;  
        for (int i =0; i <= Count; i++)   
        { 
            
            string = sc.nextLine(); 
            
        }  
         System.out.println("\nYou have entered: ");   
            String ss="stop";
            while(string==ss)
            {
                System.exit(0);
            }
           
    }
}
