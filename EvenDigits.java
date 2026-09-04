public class EvenDigits {
    public static void main(String[] args){
        int[] numbers = {123, 456, 789, 101112};
        Even(numbers);
    }
    static void Even(int[] a){
       
    for (int i = 0 ; i < a.length ; i++){
       

        int count = 0;
        int n = a[i];   
        while ( n > 0 ) {
            count++;
            n = n / 10;
        }
        if(count % 2 == 0){
            System.out.println("Number of digits in " + a[i] + " is: " + count + " and it is even");
        }else{
            System.out.println("Number of digits in " + a[i] + " is: " + count + " and it is odd");
        }
    }
}
}
