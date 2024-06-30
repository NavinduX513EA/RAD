import java.util.Scanner;

public class SearchWordInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String str1 = scn.nextLine();
        
        System.out.print("Enter the word to search: ");
        String word = scn.nextLine();
        
        if (str1.contains(word)) {
            System.out.println("The word '" + word + "' is found in the string.");
        } else {
            System.out.println("The word '" + word + "' is not found in the string.");
        }
    }
}
