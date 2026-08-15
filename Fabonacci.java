import java.util.Scanner;

public class Fabonacci {
   public static void main(String[] args){
      int s = 0 ;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); 
      // 
      int i = 0;
      int j = 1;
      while (s < n){
      int next = i ;
      i = i + j ;
      j = next;
      s++;

       }
   }
}