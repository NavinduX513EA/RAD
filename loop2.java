import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter ther height of the pyramid: ");
        int x=scn.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = x - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
