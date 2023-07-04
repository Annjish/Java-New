import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q17{
    public static void main(String[] args) {
         System.out.println("Name:ANNJISH KUNJUMON");
	System.out.println("Reg No:SJC22MCA-2009");
	System.out.println("Date:27-06-2023");
	System.out.println("Course Name:OBJECT ORIENTED PROGRAMMING LAB");	
	System.out.println("Course code:20MCA132"); 
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine(); 
            map.put(key, value);
        }

        System.out.println("Initial Map:");
        printMap(map);

        System.out.print("Enter the key to change the value: ");
        String keyToChange = scanner.nextLine();
        if (map.containsKey(keyToChange)) {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            map.put(keyToChange, newValue);
            System.out.println("Value changed successfully.");
        } else {
            System.out.println("Key not found in the map.");
        }

        // Removing an element
        System.out.print("Enter the key to remove the element: ");
        String keyToRemove = scanner.nextLine();
        if (map.containsKey(keyToRemove)) {
            map.remove(keyToRemove);
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Key not found in the map.");
        }

        // Printing the final map
        System.out.println("Final Map:");
        printMap(map);

        scanner.close();
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

