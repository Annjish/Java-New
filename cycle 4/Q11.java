import java.util.*;

public class Q11 {
    public static  void main(String[] args){
        System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:26-06-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
        LinkedList<String> L=new LinkedList<>();
        L.add("JAVA");
        L.add("PYTHON");
        L.add("CSS");
        L.add(0,"PROGRAMING LANGUAGE");
        System.out.println(L);
        L.remove("CSS");
        System.out.println(L);
        L.remove(2);
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.removeFirst();
        System.out.println(L);


    }

}
