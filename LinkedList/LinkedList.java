// LinkedList.java

// Node class representing each element of the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with all operations
public class LinkedList {
    Node head; // head of the list

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        prev.next = current.next;
    }

    // Search for a value in the list
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
