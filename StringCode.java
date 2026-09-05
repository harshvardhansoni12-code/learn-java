import java.util.Arrays;
import java.util.Scanner;

public class StringCode {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
System.out.println(Arrays.toString(str.toCharArray()));
char target = sc.nextLine().charAt(0);
//  char target = 's';
//  char s = 's';
//  System.out.println(s);
 System.out.println(target);
//  s = 'a';
//  System.out.println(s);
 System.out.println(target);
search(str , target);
}

static int search( String str , char target){
    if ( str.length()  == 0){
        System.out.println("String is empty");
        return -1;
    }
    for ( int i = 0 ; i < str.length() ; i++) {
        if ( target == str.charAt(i)){
            System.out.println("Character found at index: " + i);
            return i;
        }
    }
    return -1;
}   
}
