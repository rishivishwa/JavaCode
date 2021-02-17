
package newmca;

import java.util.Scanner;



public class Hello {
    // declearing globle variable..
        int a;
        int b;
        int c=0;
    // user define function    
    public void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        c=a+b;
        System.out.println("answer : " + c);   
    }
    //user define function
    public void sub()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        c=a-b;
        System.out.println("answer : " + c);
    }
    //main function
    public static void main(String args[])
    {
     Hello h=new Hello();
     h.sum();
     h.sub();
    }
    
}
