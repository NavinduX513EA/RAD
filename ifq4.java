import java.util.Scanner;
public class ifq4 {
  public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.print("Sample Input: ");
      int x=scn.nextInt();
      int y=scn.nextInt();
      if(x<y){
        System.out.println("The larger number is "+y);
      }
      else if(x==y){
        System.out.println("Both numbers are equal.");
      }
      else{
        System.out.println("The larger number is "+x);
      }
  }  
}
