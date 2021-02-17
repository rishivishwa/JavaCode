
package newmca;


public class Function {
    public void Sum()
    {
     int a=5;
     int b=6;
     int c=a+b;
     System.out.println("sum=:"+c);
    }
    public void divide()
    {
     int a=5;
     int b=6;
     int c=b-a;
     System.out.println("Divide = :"+ c);
    }
}
class inherit extends Function{
    public void multyply()
    {
     int a=5;
     int b=6;
     int c=b*a;
     System.out.println("multyply = :"+ c);
    }
}
class nextinherit extends inherit{
    public void Division()
    {
     int a=5;
     int b=6;
     int c=b%a;
     System.out.println("Division = :"+ c);
    }
}
class result{
    public static void main(String args[])
    {
      nextinherit obj=new nextinherit(); 
      obj.Sum();
      obj.divide();
      obj.multyply();
      obj.Division();
    }
}
