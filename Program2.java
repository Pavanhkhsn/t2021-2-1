import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int z=1;
	    for(int x=1;x<=a;x++)
	    {
	    	if(x==a)
	    	{
	    		System.out.println(z);
	    	}
	    	else {
	    	System.out.print(z+",");
	    	z=z+2;
	    	}
	    }	
	}
}
