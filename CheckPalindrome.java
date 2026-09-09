public class CheckPalindrome {
    public static void main(String[] args){
    String p = "MADAgM";
    int i = 0;
    int j = p.length() -1;
   boolean palindrome = true;
    while ( i < j ) {
        if (p.charAt(i) != p.charAt(j)){
            palindrome = false;
        }
        i++;
        j--;
    }
    if(palindrome) {
        System.out.println("palidrome");
    }else{
         System.out.println("nope");
    }
    }  
}