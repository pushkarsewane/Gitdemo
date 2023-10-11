package Arrayjava;

import java.io.*;
class MatrixTranspose
{
	public static void getTranspose() throws IOException
	{
	int m,n,i,j;
	int a[][]=new int[10][10];
	int b[][]=new int[10][10];
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
		
		 for  (i=0;i<m;i++)
		 {
		 for(j=0;j<n;j++)
		 {
			 b[i][j]= a[i][j];
		 }
		 }
		 System.out.println("the resultant matrix B");

		 for  (i=0;i<n;i++)
		 {
		 for(j=0;j<m;j++)
		 {
			 System.out.print(b[i][j]+"\t");
		 }
			 System.out.println();
		 }
	}
}


public class ResultMatrixTranspose {

	public static void main(String args[]) throws IOException
	{
		MatrixTranspose mt=new MatrixTranspose();
		mt.getTranspose();
	}
}





























public class ResultMatrixTranspose {

}
