import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
        String[] strings = {"dog", "cat", "bird", "zebra", "elephant"};
        System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:27-03-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132");
        Arrays.sort(strings);
        
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
