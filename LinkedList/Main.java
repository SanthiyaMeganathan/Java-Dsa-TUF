// Main.java

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtBeginning(5);

        System.out.println("Linked List:");
        list.display();

        System.out.println("Deleting 20 from the list:");
        list.delete(20);
        list.display();

        System.out.println("Searching for 30 in the list:");
        System.out.println(list.search(30) ? "Found" : "Not Found");

        System.out.println("Searching for 40 in the list:");
        System.out.println(list.search(40) ? "Found" : "Not Found");
    }
}
