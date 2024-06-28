
import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("start with: ");
        int x=scn.nextInt();
        for (int i = x; i < 9; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            x++;
        }
    }
}
