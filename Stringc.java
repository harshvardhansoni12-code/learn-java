// string comparison

public class Stringc {
    public static void main(String[] args){
      String str1 = "Hello";
      String str2 = "Hello";

      String str3 = new String("ling");
      String str4 =  new String("ling");
      boolean result = Compare(str1 , str2);
      System.out.println(result);
      System.out.println(str3 == str4);
      System.out.println(str3.equals(str4)); 
    }
    //  .equals() ===>>> Compares the content of the string
    //   boolean result1 = Compare(str3 , str4); 
    //   System.out.println(result1); 
    
    static boolean Compare(String str1 , String str2){
        if ( str1 == str2){
            return true;
        }
        else{
            return false;
        }
    }   
}
