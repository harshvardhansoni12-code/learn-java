import java.util.*;
public class StackInBuilt {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(1);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.empty();
    if (stack.search(3) !=-1){
        System.out.println("Element found");
    }else{
        System.out.println("Element not found");
    }
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
