import java.util.*;
class Array
{
public static void main(String args[])
{
	System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:28-04-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
Scanner sc=new Scanner(System.in);
int i,n,s,flag=0;
System.out.println("enter the number of elements :");
n=sc.nextInt();
int [] a=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the element to be searched:");
s=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==s)
{
System.out.println("Element " + s + "found at "+ i + " position");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Element not found");
}
}
}

