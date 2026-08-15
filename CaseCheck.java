import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(5);
        System.out.println(ch);
        if (ch >= 'A' && ch <='Z'){
            System.out.println("Uppercase");
        }else {
            System.out.println("LowerCase");
        }
        // String word = "hello";
        // System.out.println(word.charAt(1));
    }
}
