package Arrayjava;
import java.io.*;
class MatDivisionScalar
{
	public static void divisionScalar() throws IOException
	{
	int m,n,i,j,k;
	int a[][]=new int[10][10];
	double b[][]=new double[10][10];
	InputStreamReader isr=new InputStreamReader (System.in);
	BufferedReader br= new BufferedReader (isr);
	System.out.println("enter order of  matrix A ");
	m=Integer.parseInt(br.readLine());
	n=Integer.parseInt(br.readLine());
	System.out.println("enter value matrix A ");

	 for  (i=0;i<m;i++)
	 {
	 for(j=0;j<n;j++)
	 {
	 a[i][j]=Integer.parseInt(br.readLine());
	 }
	 }
		System.out.println("enter value of scalar k ");
		k=Integer.parseInt(br.readLine());
		 for  (i=0;i<m;i++)
		 {
		 for(j=0;j<n;j++)
		 {
			 b[i][j]= a[i][j]/k;
		 }
		 }
		 System.out.println("the resultant matrix B");

		 for  (i=0;i<m;i++)
		 {
		 for(j=0;j<n;j++)
		 {
			 System.out.print(b[i][j]+"\t");
		 }
			 System.out.println();
		 }
	}
}


public class ResultMatDivsionScalar {

	public static void main(String args[]) throws IOException
	{
		MatDivisionScalar ms=new MatDivisionScalar();
		ms.divisionScalar();
	}
}
