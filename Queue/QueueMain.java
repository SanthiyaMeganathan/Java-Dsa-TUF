
public class QueueMain {

    public static void main(String[] args) throws Exception {

        CustomQueue queue = new CustomQueue(5);

        queue.insert(2);
        queue.insert(13);
        queue.insert(14);
        queue.insert(7);
        queue.insert(8);

        queue.display();

        //removing the item from the queue.

        System.out.println(queue.remove());

        System.out.println("......");

        queue.display();



    }
}
