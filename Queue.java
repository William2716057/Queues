import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
 
        //add elements
        queue.add("Bread");
        queue.add("Eggs");
        queue.add("Bacon");
	queue.add("Cornflakes");
 
        //print queue
        System.out.println("Queue: " + queue);
 
        //remove element from front of queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);
 
        //print updated queue
        System.out.println("Queue after removal: " + queue);
 
        //add extra element to queue
        queue.add("Potatoes");
 
        //peek at element at front
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
 
        //print updated queue
        System.out.println("Queue after peek: " + queue);
    }
}
