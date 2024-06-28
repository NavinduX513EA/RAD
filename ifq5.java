import java.util.Scanner;
public class ifq5 {
    public static void main(String[] args){
      Scanner scn=new Scanner(System.in);
      System.out.print("Sample input: ");
      int x=scn.nextInt();
      if (x>=90) {
          System.out.println("Grade: A");
      }
      else if(x>=80&&x<=89){
        System.out.println("Grade: B");
      }
      else if (x>=70 && x<=79 ) {
        System.out.println("Grade: C");
          
      }
      else if(x>=60 && x<=69){
        System.out.println("Grade: D");
      }
      else{
        System.out.println("Grade: F");
      }
    }
}
