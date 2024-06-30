import java.util.Scanner;

public class divi{
  public static void main(String[] args){

    Scanner scn=new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int x=scn.nextInt();
    if(x%5==0 && x%11==0){
        System.out.println("This Number is Divisible by 5 and 11");
    }
    else{
        System.out.println("Not divisible by 11 and 5");
    }
  }

}