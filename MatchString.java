
package newmca;
import java.util.*;

public class MatchString {
     
    public static void main(String [] args){

 /* Scanner sc = new Scanner(System.in);
  //String s = new String();
  System.out.print(" enter  name: ");
  
   String s=sc.nextLine();
  for(int x=0; x<s.length(); x++){
     //s = sc.nextLine();
     s = s + " ";
     
     if(s.equals("stop")){
     System.out.println(s);
     System.exit(0);
     break;
     }
     else
     {
       continue;
     }
   }*/
    Scanner sc = new Scanner(System.in);
    String rishi = "";
    System.out.print(" enter name: ");
    while (true){
        String string = sc.nextLine();
        //if(string.equalsIgnoreCase("stop"))
        if(string.equals("stop"))
            break;
            rishi += string + "";
        }
    }
}















/*if (rishi.length() >= 5)
    rishi = rishi.substring(0, rishi.length() - 5);
    System.out.println(rishi);
 */
 
 
 

 