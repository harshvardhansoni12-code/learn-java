import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
//
public class QueueBuilt {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(8);
        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.add(1);
        System.out.println(queue);
        queue.remove(5);
        System.out.println(queue);
        System.out.println(queue.peek());


//Deque
        Deque<Integer> deque = new ArrayDeque<>(); 
        

    }
}
