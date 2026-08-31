// array 

/*
syntax:
data_type[] array_name = new data_type[size];
*/

public class Array {
    public static void main(String[] args){
    int[] roll_no = new int[5];
     roll_no[0] = 1;
     roll_no[1] = 2;
     roll_no[2] = 3;
     roll_no[3] = 4;
     roll_no[4] = 5;    
     System.out.println(roll_no[3]);

     int[] roll_no1;
     roll_no1 = new int[5]; //here obj is being created(heap memory)
     System.out.println(roll_no1[3]);
    }
}
