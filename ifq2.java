import java.util.Scanner;
public class ifq2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Sample Input: ");
        int x=scn.nextInt();
        if(x%2==1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }
}
