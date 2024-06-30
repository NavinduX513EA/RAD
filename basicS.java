import java.util.Scanner;

public class basicS {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Basic Salary: ");
        int b = scn.nextInt();
        double hra, da, g;
        if (b <= 10000) {
            hra = 0.20*b;
            da = 0.80*b;
        } else if (b <= 20000) {
            hra = 0.25*b;
            da = 0.90*b;
        } else {
            hra = 0.30*b;
            da = 0.95*b;
        }

        g = b + hra + da;
        System.out.printf("Gross Salary: %.1f\n",+ g);
    }
}
