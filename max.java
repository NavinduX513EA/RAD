import java.util.Scanner;

public class max {
    public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the number 1: ");
        int x = scn.nextInt();
        
        System.out.print("Enter the number 2: ");
        int y = scn.nextInt();

        
        
        System.out.print("Enter the number 3: ");
        int z = scn.nextInt();

        if (x>y&&x>z) {
            System.out.print("Sample output: "+x);
            
        }
        if (y>x&&y>z) {
            System.out.print("Sample output: "+y);
            
        }
        else{
            System.out.print("Sample output: "+z); 
        }
        

    }
}
