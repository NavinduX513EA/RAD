import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Fill the HashMap with character counts
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character
        char result = 0;
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                result = c;
                break;
            }
        }
        
        if (result != 0) {
            System.out.println("The first non-repeating character in '" + str + "' is: " + result);
        } else {
            System.out.println("All characters in '" + str + "' are repeating.");
        }
    }
}
