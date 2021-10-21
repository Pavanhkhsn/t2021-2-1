import java.util.Scanner;
public Calci(
double d=0;
public Calci(double a, double b,String s)
{
if(s.equals("Addition"))
{
d=a+b;
System.out.println(d);
}
else if(s.equals("Subtraction"))
{
d=a-b;
System.out.println(d);
}
else if(s.equals("Multiplication"))
{
d=a*b;
System.out.println(d);
}
else if(s.equals("Division"))
{
d=a/b;
System.out.println(d);
}
}
}
  public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		String s=sc.next();
		Calci c=new Calci(a,b,s);
	}
}
