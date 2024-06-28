import java.util.Scanner;
public class ifq3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Sample Input: ");
        int x=scn.nextInt();
        if(x>=18){
            System.out.println("You are eligible to vote.");
    
        } 
        else{
            System.out.println("Not eligible.");
        }
    }
    

}
