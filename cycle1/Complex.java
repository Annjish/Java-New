class Complex {
int real, image;
public Complex(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
 
    public void showC()
    {
  
        System.out.print(this.real + " +i" + this.image);
    }
 
    public static Complex add(Complex n1,Complex n2)
    {
Complex res = new Complex(0, 0);
 res.real = n1.real + n2.real;
res.image = n1.image + n2.image;
return res;
    }
 
    public static void main(String arg[])
    {
    	System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:24-03-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
 Complex c1 = new Complex(4, 5);
 Complex c2 = new Complex(10, 5);
 System.out.print("first Complex number: ");
 c1.showC();
 System.out.print("\nSecond Complex number: ");
 c2.showC();
 Complex res = add(c1, c2);
 System.out.println("\nAddition is :");
 res.showC();
    }
}
