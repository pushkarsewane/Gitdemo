package Arrayjava;
import java.io.*; 
class MatrixAdd
{
public static void addMatrices() throws IOException
{
int m,n,p,q,i,j;
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
InputStreamReader isr=new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (isr);
System.out.println("enter order of first matrix A ");
m=Integer.parseInt(br.readLine());
n=Integer.parseInt(br.readLine());
System.out.println("enter order of second matrix B ");
p=Integer.parseInt(br.readLine());
q=Integer.parseInt(br.readLine());
if (m!=p||n!=q)
{
	System.out.println("matrices not added because order not same ");
}
	else
	{
		System.out.println("enter value first matrix A ");

   for  (i=0;i<m;i++)
{
for(i=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
	   System.out.println("enter value sec matrix B");
   for  (i=0;i<p;i++)
   {
   for(i=0;j<q;j++)
   {
   b[i][j]=Integer.parseInt(br.readLine());
   }
   }
   for  (i=0;i<m;i++)
   {
   for(i=0;j<n;j++)
   {
   c[i][j]=a[i][j]+b[i][j];
   }
   }
   for  (i=0;i<m;i++)
   {
   for(i=0;j<n;j++)
   {
	   System.out.print(c[i][j]+"\t");
	   
      System .out.println();
   }
   }
	}
public class ResultMatrixAdd {
public static void main (string args[]) throws IOException
{
MatrixAdd ma=new MatrixAdd();
ma.addMatrices();
}
}
}


