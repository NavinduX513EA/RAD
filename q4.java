import java.util.Scanner;
public class q4{
  public static void main(String[] args){
  Scanner scn=new Scanner(System.in);
  System.out.print("enter a string: ");
  String str1=scn.nextLine();
  int i=0;
  int v=0;
  int c=0;
   while(i<str1.length()){
   if((str1.charAt(i))=='a' || (str1.charAt(i))=='e' || (str1.charAt(i))=='i' || (str1.charAt(i))=='o' || (str1.charAt(i))=='u'){
     v++;
    


   }
   else{
    c++;
    
   }


   i++;
   }
   System.out.println("vowels: " +v);
   System.out.println("consenants: "+c);

  }

}