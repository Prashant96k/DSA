import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // for accessing child class to access data from parent class and
                                                   // this is type of syntax

        // add the element

        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        System.out.println("Peak element " + queue.peek()); // to find peek element

        System.out.println("Removed element " + queue.remove()); // To remove element
        System.out.println(queue); // to print whole queue;
        System.out.println(queue.size()); // to print size
        System.out.println("queue is empty true or false :" + queue.isEmpty()); // check the empty
        while (!queue.isEmpty()) { // print all element using traverse method

            System.out.println(queue.peek());
            queue.remove();

        }
        // add the element in

    }
}
