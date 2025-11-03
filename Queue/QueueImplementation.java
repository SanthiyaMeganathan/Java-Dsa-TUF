
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {

    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);

        System.out.println("Printing the elements of the queue");

        System.out.println("peek : get but dont remoev,  remove: it get and remove");

        System.out.println(qu.peek());
        System.out.println(qu.peek());
        System.out.println(qu.peek());

        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.remove());

    }
}
