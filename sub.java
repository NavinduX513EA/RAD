
import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
   System.out.print("Enter the main String: ");
   String str1=scn.nextLine();
   System.out.print("Enter the substring to find: ");
   char z=scn.next().charAt(0);
   System.out.println("The substring is: "+ str1.indexOf(z));
    }
}
