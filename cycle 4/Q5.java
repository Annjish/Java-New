import java.util.Scanner;
 class prime extends Thread{
    int num;
    public prime(int n){
        this.num=n;
    }
    public void run(){
        int x, y, flg;
        System.out.println("All the Prime numbers within 1 and " + num + " are:");
        for (x = 1; x <= num; x++) {
            if (x == 1 || x == 0)
                continue;
            flg = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print("prime number ="+x +"\n");
        }
    }
}
 class mul extends Thread{
    public void run(){
        System.out.println("\n");
        for(int i =0;i<11;i++){
            System.out.println("5*"+i+" = "+5*i);
           
        }
    }
}
public class Q5{
    public static void main(String[] args) {
        System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:26-06-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
        System.out.println("Enter The number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        mul obj1 = new mul();
        obj1.start();
        prime obj2 = new prime(number);
        obj2.start();
        
    }
}
