package Arrayjava;
import java.io.*;
class ArraySearch 
{
	public void linearSearchAll() throws IOException
	{
		int i,item,flag=0,n;
		int a[]=new int [100];
	}
	InputStreamReader isr=new InputStreamReader (System.in);
	BufferedReader br= new BufferedReader (isr);
	System.out.println("How many value? ");
	n=Integer.parseInt(br.readLine());
if (n<=0||n>100)		
{
System.out.println("Invalid value of n enter value of n in between 1to100 ");
System.out.println("How many value? ");
n=Integer.parseInt(br.readLine());	
}
System.out.println("enter value in array? ");
	for(i=0;i<n;i++)
	{
a[i]= Integer.parseInt(br.readLine())	;
	
}
	System.out.println("enter data item to be search ");
	item=Integer.parseInt(br.readLine());
for=(i=0;i<n;i++)
{
	if(item==a[i])
	{flag=1;
	System.out.println("data item found at location"+(i+1));
	
	}
}
if (flag==0)
{
	System.out.println("data item not found in the array");
	
	}
}
}	
	

public class ResultLinear {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
ArraySearch as=new ArraySearch();
as.linearSearchAll();
	}

}
