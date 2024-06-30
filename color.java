import java.util.Scanner;

public class color{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the color code (R, G, B, Y, O): ");
        char c = scn.next().charAt(0);
        switch (c) {
            case 'R':
                System.out.println("Red");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            default:
                System.out.println("Invalid color code");
                break;
        }

       
    }
}
