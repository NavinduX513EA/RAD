import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    System.out.print("Enter marks for Physics =");
    int x=scn.nextInt();
    System.out.print("Enter marks for Chemistry =");
    int y=scn.nextInt();
    System.out.print("Enter marks for Biology =");
    int z=scn.nextInt();
    System.out.print("Enter marks for Mathematics =");
    int a=scn.nextInt();
    System.out.print("Enter marks for Computer =");
    int b=scn.nextInt();
    System.out.println("Total: "+(x+y+z+a+b));
    System.out.println("Precentage: "+(x+y+z+a+b)/5);
    if((x+y+z+a+b)/5>=90){
        System.out.println("Grade A");
    }
   else if((x+y+z+a+b)/5>=80){
        System.out.println("Grade B");
    }
   else if((x+y+z+a+b)/5>=70){
        System.out.println("Grade C");
    }
   else if((x+y+z+a+b)/5>=60){
        System.out.println("Grade D");
    }
   else if((x+y+z+a+b)/5>=40){
        System.out.println("Grade E");
    }
  else if((x+y+z+a+b)/5<40){
        System.out.println("Grade F");
    }
    }
}
