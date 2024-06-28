import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x=scn.nextInt();
        System.out.print("Enter the second number: ");
        int y=scn.nextInt();
        System.out.print("Enter the operator(+, -, *, /): ");
        char z=scn.next().charAt(0);
        switch(z){
            case '+' :
            System.out.println("Addition of th two numbers is "+(x+y));
            break;
            case '-':
            System.out.println("Substraction of th two numbers is "+(x-y));
            break;
            case '*':
            System.out.println("Multiplication of th two numbers is "+(x*y));
            break;
            case '/':
            if(y==0){
                System.out.println("Division by Zero is not allowed.");
                break;
            }
            else{
                System.out.println("Division of th two numbers is "+(x/y));
                break;
            }
            
        }
    }
}
