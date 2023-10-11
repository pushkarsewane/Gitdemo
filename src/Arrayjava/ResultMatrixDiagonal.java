package Arrayjava;

import java.io.*;
class MatrixDiagonal
{
	public static void getSumDiagonal() throws IOException
	{
	int m,n,i,j,sum=0,b;
	int a[][]=new int[10][10];
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
		 sum=sum+a[i][i];
	 }
	 }
	 System.out.println("sum of daigonal element"+sum);

	}
}

public class ResultMatrixDiagonal {
	public static void main(String args[]) throws IOException
	{
		MatrixDiagonal  md=new MatrixDiagonal();
		md.getSumDiagonal();
	}
}
	
	
	
	

