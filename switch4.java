import java.util.Scanner;

public class switch4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the moth number (1-12): ");
        int x=scn.nextInt();
        switch(x){
            case 2:
            System.out.println("The number of days in the month 2 is "+28);
            break;
            case 4:
            System.out.println("The number of days in the month 4 is "+30);
            break;
            case 6:
            System.out.println("The number of days in the month 6 is "+30);
            break;
            case 9:
            System.out.println("The number of days in the month 9 is "+30);
            break;
            case 11:
            System.out.println("The number of days in the month 11 is "+30);
            break;
            case 1:
            System.out.println("The number of days in the month 1 is "+31);
            break;
            case 5:
            System.out.println("The number of days in the month 1 is "+31);
            break;
            case 7:
            System.out.println("The number of days in the month 7 is "+31);
            break;
            case 8:
            System.out.println("The number of days in the month 8 is "+31);
            break;
            case 10:
            System.out.println("The number of days in the month 10 is "+31);
            break;
            case 12:
            System.out.println("The number of days in the month 12 is "+31);
            break;
        }
    }
}
