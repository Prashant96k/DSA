import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue pQ=new PriorityQueue();
      //  PriorityQueue pQ=new PriorityQueue(Comparator.reverseOrder()); for changing order
        pQ.add(10);
        pQ.add(14);
        pQ.add(15);
        pQ.add(16);
        pQ.add(17);
        System.out.println(pQ);

    }
    
}
