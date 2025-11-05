public class DqueueMain{

    public static void main(String[] args)throws Exception {

        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(7);
        queue.insert(17);
        queue.insert(72);
        queue.insert(73);
        queue.insert(74);

        queue.display();

        queue.remove();

        queue.display();

        queue.insert(89);
        queue.display();
        
    }

}