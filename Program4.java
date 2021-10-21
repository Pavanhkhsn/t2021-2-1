import java.util.Arrays;
import java.util.Scanner;
public class Program4{
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the size of the int array");
    int size=scan.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<arr.length;i++)
    {
    	int x=scan.nextInt();
    	arr[i]=x;
    } 
    System.out.println(Arrays.toString(arr));
    for(int j=1;j<=arr.length;j++)
    {
    	int p=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]%j==0)
    		{
    			p++;
    		}
    	}
    	if(j==arr.length)
    	{System.out.println(j+":"+p);}
    	else
    	{
    	System.out.print(j+":"+p+",");
    	}
    }
	}

}
