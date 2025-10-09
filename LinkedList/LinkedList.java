
import java.util.*;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {

    Node head;
    Node tail;

    //function to insert at begniing:
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

    }

    //function to insert the node at end:
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.next = head;
            head = newNode;
            tail = newNode;
            return;
        }
        // using tail traversing and inserting at end

        /* Node temp =head;

        // while(temp!=null){
        //     tail = temp;
        //     temp =temp.next;

        // }
        tail.next=newNode;*/
        // without tail:

        /*Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;*/
        //with tail without traversing:
        tail.next = newNode;
        tail = newNode;
    }

    //insert at any postion:
    public void insertAtAnyPosition(int value) {
        Node newNode = new Node(value);
        System.out.println("Enter the position you want to insert the element in the list");
        Scanner input = new Scanner(System.in);
        int position = input.nextInt();
        int count = 1;
        Node temp1 = head;
        Node temp = head;
        while (temp1.next != null) {
            count = count + 1;
            temp1 = temp1.next;
        }
        if (position >= count) {
            temp1.next = newNode;
            tail = newNode;

        } else if (position <= 0) {
            newNode.next = head;
            head = newNode;
        } else {
            int index = 0;
            Node first = head;
            Node last = head.next;
            while (index < position) {

                first = temp;
                last = temp.next;
                temp = temp.next;
                index = index + 1;
            }
            first.next = newNode;
            newNode.next = last;
        }

    }

    //delete from begining:
    public void deleteBeginning() {

        if (head == null) {
            System.out.println(" ");
            System.out.println("There is nothing to delete");
            return;
        }

        head = head.next;
    }

    //delete at end:
    public void deleteAtEnd() {

        Node temp = head;
        Node lastBefore = head;

        if (head == null) {
            System.out.println("There is nothing to delete");
            return;
        } else if (head.next == null) {
            System.out.println("You had only one element that too deleted");
            head = null;
            return;

        } else {
            while (temp.next != null) {
                lastBefore = temp;
                temp = temp.next;
            }

            lastBefore.next = null;

            System.out.println("one element dleted from last");
        }

    }

    //delet from where ever you want:
    public void deleteFromAnyWhere() {
        Node temp = head;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position you wnat to delete");

        int position = input.nextInt();
        if (head == null) {
            System.out.println("There is nothing to delete");
            return;
        }

        if (position <= 0) {
            head = head.next;
            return;
        }

        int size = 0;
        while (temp != null) {
            size = size + 1;
            temp = temp.next;
        }

        if (position >= size || position == size - 1) {

            //remove last
            Node temp1 = head;

            while (temp1.next != null) {
                tail = temp1;
                temp1 = temp1.next;

            }

            tail.next = null;
            return;

        } else {

            int index = 0;
            Node temp2 = head;
            Node position_before = head;
            Node positionNode = head.next;
            while (index < position) {
                position_before = temp2;
                positionNode = temp2.next;
                temp2 = temp2.next;
                index = index + 1;
            }

            position_before.next = positionNode.next;

        }
    }

    //to print the elements in linked list;
    public void printlist() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    // to find does element present or not:
    public void findTraget() {
        Node temp = head;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element that you wnat to find in the linked i]list");
        int target = input.nextInt();

        while (temp != null) {
            if (temp.data == target) {
                System.out.println("we found the target:  " + target);
                return;

            }
            temp=temp.next;
        }

        System.out.println("Target not present in the given linked list");
    }

}
