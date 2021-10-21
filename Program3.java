import java.util.Scanner;
public class Program3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
    if(z%2==0)
    {
    	z=z-1;
    }
    int a=1;
    for(int i=0;i<z;i++)
    {
    	if(i!=z-1)
    	{System.out.print(a+",");}
    	else 
    	{System.out.println(a);}   
     a=a+2;
    }
	}
}
