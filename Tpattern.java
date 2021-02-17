
package newmca;


public class Tpattern {
    public static void main(String args[])
    {
        int row=5;
        for(int i=0;i<=row;i++)
        {
            i++;
            for(int j=1;j<=i;j++)
            {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
