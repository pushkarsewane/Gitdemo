package Arrayjava;

import java.io.*;
class LowerPlusDiagonal
{
	public static void getLowerDiagonal() throws IOException
	{
	int m,n,i,j,sum=0;
	int a[][]=new int[10][10];
	InputStreamReader isr=new InputStreamReader (System.in);
	BufferedReader br= new BufferedReader (isr);
	System.out.println("enter order of  matrix A ");
	m=Integer.parseInt(br.readLine());
	n=Integer.parseInt(br.readLine());
	if(m!=n)
	{
	System.out.println("not square matrix  ");
	}
	else
	{
		System.out.println("enter the value matrix A");	
	
	 for  (i=0;i<m;i++)
	 {
	 for(j=0;j<n;j++)
	 {
	 a[i][j]=Integer.parseInt(br.readLine());
	 }
	 }
	 for  (i=0;i<m;i++)
	 {
	 for(j=0;j<n;j++)
		 if (i>=j)
	 {
		 sum=sum+a[i][j];
	 }
	 }
	 System.out.println("sum of lower daigonal and daigonal element"+sum);

	}
}
}
class ResultLowerPlusDiagonal {
	public static void main(String args[]) throws IOException
	{
		LowerPlusDiagonal  md=new LowerPlusDiagonal();
		md.getLowerDiagonal();
	}
}



















































public class ResultLowePlusDiagonal {

}
