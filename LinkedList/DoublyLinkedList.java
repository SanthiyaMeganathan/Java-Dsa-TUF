
import java.util.*;


class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}

class DoublyLinkedList {

    Node head;

    //function to add the first node:
    public void addFirstNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        newNode.prev = null;
        newNode.next = null;
    }

    //adding the node at head/beginning:
    public void addAtBeginning(int value) {

        if (head == null) {
            Node newNode = new Node(value);
            head = newNode;
            head.prev = null;
            head.next = null;

        } else {

            Node newNode = new Node(value);
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
    }

    // add at ending:
    public void addAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {

            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            newNode.prev = temp;
            newNode.next = null;
            temp.next = newNode;

        }
    }

    //To add at anywhere:
    public void addAtAnywhere(int value) {
        Node newNode = new Node(value);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position where you want to insert the new node: ");
        int position = input.nextInt();

        // CASE 1: Empty list
        if (head == null) {
            head = newNode;
            System.out.println("List was empty, node added as head.");
            return;
        }

        // CASE 2: Insert at beginning (position <= 0)
        if (position <= 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        // CASE 3: Calculate size of DLL
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // CASE 4: Insert at end (position >= size)
        if (position >= size) {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
            return;
        }

        // CASE 5: Insert in the middle
        Node current = head;
        int index = 0;
        while (index < position - 1 && current != null) {
            current = current.next;
            index++;
        }

        Node nextNode = current.next;
        newNode.next = nextNode;
        newNode.prev = current;
        current.next = newNode;
        if (nextNode != null) {
            nextNode.prev = newNode;
        }
    }
    

    //deleting:

    //delete the beginning:

    public void deleteAtStart(){
        Node temp=head;

        if(head==null){

            System.out.println("There is nothing in the list to delet");

        }else if (head.next==null){

            System.out.println("you have only one element in you list, that too deleted now");
            head=null;
            

        }else{

            head=head.next;
            head.prev=null;
            System.out.println("Now your first element is deleted");

        }
    }


    // to delete at end:

    public void deleteAtEnd(){
        Node temp=head;

        if(head==null){
            System.out.println("There is nothing to delete");

        }else if (head.next==null){
            System.out.println("You have only one element in thelinked list");
            System.out.println("now that tooo delete ");
            head=null;

        }else{
            while(temp.next.next!=null){
                temp=temp.next;
            }

            temp.next=null;
            System.out.println("The element is deleted");
        
        }
    }


    //printing:
    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
