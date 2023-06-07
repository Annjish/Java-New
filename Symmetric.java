import java.util.*;
class Symmetric
{  
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,j,r,c,flag=1;
	System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:24-03-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
System.out.println("Enter the number of rows:");
r = sc.nextInt();
System.out.println("Enter the number of columns:");
c = sc.nextInt();
int[][] m = new int[r][c];
int [][] transpose = new int[r][c];
System.out.println("Enter the elements of the matrix") ;
for(i=0;i<r;i++)
{ 
for(j=0;j<c;j++)
{ 
m[i][j] = sc.nextInt();
}
}
System.out.println("The elements of the matrix") ;
for(i=0;i<r;i++)
{ 
for(j=0;j<c;j++)
{ 
System.out.print(m[i][j]+"\t");
}
System.out.println("");
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
transpose[j][i]=m[i][j];
}
}
if(r==c)
{
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(m[i][j]!=transpose[i][j])
{	
flag=0;
break;
}	
}
if(flag==0)
{
System.out.print("\nThe matrix is not symmetric");                	
break;	
}
}
if(flag==1)
{
System.out.print("\nThe matrix is symmetric\n");
}
}
else
{
System.out.print("\nThe matrix is not symmetric\n");
}
}	
}
