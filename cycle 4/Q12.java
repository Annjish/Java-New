import  java.util.*;
public class Q12 {
    public static void main(String[] args) {
        System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:26-06-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(67);
        st.push(89);
        st.push(23);
        System.out.println("Stack = "+st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position : ");
        int x = sc.nextInt();
        st.remove(x);
        System.out.println("Stack = "+st);
    }
}
