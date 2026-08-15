import java.util.Scanner;

public class function {
    public static void main(String[] args){
     
       int result = sum();    
       System.out.println(result);  
    }
     /*
        access modifier returnType nName(parameters){
            //function body
            return statement;
        }
        */
      static int sum (){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c = a + b;
      //  System.out.println("The sum of two numbers is: " + c);
        return c;   
       }
}
