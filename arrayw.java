import java.util.Arrays;

public class arrayw {
   public static void main(String[] args){
    // storing a roll no:
    int a = 12;
    System.out.println(a);
    //storing student name:
    String name = "Harsh Vardhan Soni";
    System.out.println(name);
    // name = "hello";
    //  System.out.println(name); np error in code

    // store 5 roll no:
   //  int rno1 = 12;
   //  int rno2 = 15;
   //  int rno3 = 18;
   //  int rno4 = 21;
   //  int rno5 = 32;


    //Array store collection of datatype can be primitve objects or complex
    // stored variable datatype should be same 
    
    // int[] arr = new int[5]; // store 5 rno 
    // arr[0] = 1;
    // arr[1] = 23;
    // arr[3] = 34; 
    //  System.out.println(Arrays.toString(arr));
    //direct storing
    int[] rno = {1,3,5,7,9};
    System.out.println(Arrays.toString(rno));
    int[] num = new int[5];
    System.out.println(num[3]);
   } 
}
