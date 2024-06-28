 import java.util.Scanner;
public class q1{
 public static void main(String[] args){
   Scanner scn=new Scanner(System.in);
   System.out.print("Enter a sentence: ");
   String str1=scn.nextLine();
   int word=1;
   int i=0;
   char c;
   while(i<str1.length()){
    if((str1.charAt(i))==' '){
     word++;
     
    }
   i++;
   } 
   System.out.println("Number of words: "+word);
 
 
 }


}
