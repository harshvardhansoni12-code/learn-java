import java.util.Scanner;

public class function {
    public static void main(String[] args){
     float a  = sum1(); 
     System.out.println("Sum of two numbers is: " + a);
    }
     
       /* access modifier returnType nName(parameters){
            //function body
            return statement;
        }
        */
        // NOTHING IS RETURNED FROM THIS FUNCTION
        static void sum(){
          System.out.println("Enter two numbers");
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = a + b;
          System.out.println("Sum of two numbers is: " + c);
        }

        // SOMETHING IS RETURNED FROM THIS FUNCTION

        static float sum1(){
          System.out.println("Enter two numbers");
          Scanner sc = new Scanner(System.in);
          float a = sc.nextFloat();
          float b = sc.nextFloat();
          float c = a + b;
          return  c;
        }


        // pass the value to the function
        static void sum2(int a , int b){
            int c = a + b;
            System.out.println("Sum of two numbers is: " + c);
        }

}
