public class product{
int pcode;
String pname;
int price;
	void getdata(int p1,String p2,int p3)
	{
	pcode=p1;
	pname=p2;
	price=p3;
	}
	public static void main(String[] args)
	{
	int smallest;
	System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:24-03-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
	
	product  ob1=new product();
	product ob2=new product();
	product ob3=new product();
		ob1.getdata(9000,"Iphone 14",70000);
		ob2.getdata(9001,"Samsung s22 ultra",120000);
		ob3.getdata(9002,"Iqoo 9 se",32000);
	if(ob1.price<ob2.price)
	{
	if(ob3.price<ob1.price)
	{
	smallest=ob3.price;
	}
	else
	{
	smallest=ob1.price;
	}
	}
	else
	{
	if(ob2.price<ob3.price)
	{
	smallest=ob2.price;
	}else
	{
	smallest=ob3.price;
	}
	}
	System.out.println(smallest+" is the cheapest");
	}
	}
	
	

