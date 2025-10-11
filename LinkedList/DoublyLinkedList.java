
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
    public void deleteAtStart() {
        Node temp = head;

        if (head == null) {

            System.out.println("There is nothing in the list to delet");

        } else if (head.next == null) {

            System.out.println("you have only one element in you list, that too deleted now");
            head = null;

        } else {

            head = head.next;
            head.prev = null;
            System.out.println("Now your first element is deleted");

        }
    }

    // to delete at end:
    public void deleteAtEnd() {
        Node temp = head;

        if (head == null) {
            System.out.println("There is nothing to delete");

        } else if (head.next == null) {
            System.out.println("You have only one element in thelinked list");
            System.out.println("now that tooo delete ");
            head = null;

        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
            System.out.println("The element is deleted");

        }
    }

    public void deleteFromAnyWhere() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position to delete: ");
        int position = input.nextInt();

        // Case 1: Only one node
        if (head.next == null) {
            head = null;
            System.out.println("List had only one node. It’s deleted now.");
            return;
        }

        // Case 2: Delete from beginning (position <= 0)
        if (position <= 0) {
            head = head.next;
            head.prev = null;
            System.out.println("Deleted the first node.");
            return;
        }

        // Find size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Case 3: Delete from end (position >= size - 1)
        if (position >= size - 1) {
            Node last = head;
            while (last.next.next != null) { // stop at second last node
                last = last.next;
            }
            System.out.println("Deleting last node: " + last.next.data);
            last.next = null;
            return;
        }

        // Case 4: Delete from middle
        Node current = head;
        int index = 0;
        while (index < position && current != null) {
            current = current.next;
            index++;
        }

        if (current != null) {
            Node prevNode = current.prev;
            Node nextNode = current.next;
            prevNode.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = prevNode;
            }
            System.out.println("Deleted node at position " + position + ": " + current.data);
        }
    }

    //printing in the both direction:
    public void printInBoth() {
        Node tempF = head;
        Node tempB = head;

        if (head == null) {
            System.out.println("There is nothing to delete");
            return;
        }

        // printing in front:
        System.out.println("Printing the elements from the front");

        while (tempF != null) {
            System.out.println(tempF.data);
            tempF = tempF.next;
        }

        //printing from the backword:
        while (tempB.next != null) {
            tempB = tempB.next;
        }

        System.out.println("Printing from backward");

        while (tempB != null) {
            System.out.println(tempB.data);
            tempB = tempB.prev;
        }
    }

    //searching for the element in the list:
    public int searchElement() {

        Node temp = head;
        System.out.println("Enter the element you wnat to find in the given list");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        if (head == null) {
            System.out.println("The list is empty");
            return -1;
        }

        int position = 0;

        while (temp != null) {
            if (temp.data == target) {
                System.out.println("The element found   " + "  " + target + "   " + " at the position" + position);
                return target;
            }

            position++;
            temp = temp.next;
        }

        System.out.println("The element you are searching for not presnt in the list");

        return -1;

    }

    //finding the node reference of the target value:
    public int findNodeRef() {

        Node temp = head;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target you want to find");
        int target = input.nextInt();

        if (head == null) {
            System.out.println("there is nothing in the list");
            return -1;
        }

        int position = 0;

        while (temp != null) {
            if (temp.data == target) {
                System.out.println("The target found" + temp + " " + " the element is target" + target + " at the position" + position);
                return target;
            }
            temp = temp.next;
            position++;

        }
        System.out.println("The target not found");
        return -1;
    }

    // Updtaing the node:
    public void updateNodeValue() {
        if (head == null) {
            System.out.println("The list is empty");
        }

        Node temp = head;
        System.out.println("Enter the value you want to update");

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        while (temp != null) {
            if (temp.data == target) {
                System.out.println("The target you want to upadtae is found");
                System.out.println("Enter the value that you want to update");
                temp.data = input.nextInt();
                return;

            }
            temp = temp.next;
        }
        System.out.println("the target you are searching for not found");

        return;
    }

    //swapping the two nodes completly not its value:
    public void swapNode() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first element to swap:");
        int val1 = input.nextInt();
        System.out.println("Enter the second element to swap:");
        int val2 = input.nextInt();

        if (head == null || head.next == null) {
            System.out.println("List has less than 2 nodes. Cannot swap.");
            return;
        }

        if (val1 == val2) {
            System.out.println("Both values are same. No swap needed.");
            return;
        }

        Node node1 = null, node2 = null;
        Node temp = head;

        // Step 1: Find the nodes
        while (temp != null) {
            if (temp.data == val1) {
                node1 = temp;
            }
            if (temp.data == val2) {
                node2 = temp;
            }
            temp = temp.next;
        }

        if (node1 == null || node2 == null) {
            System.out.println("One or both nodes not found. Cannot swap.");
            return;
        }

        // Step 2: Swap nodes safely
        // Handle adjacent nodes
        if (node1.next == node2) {
            Node prev = node1.prev;
            Node next = node2.next;

            if (prev != null) {
                prev.next = node2;
            }
            node2.prev = prev;

            node2.next = node1;
            node1.prev = node2;

            node1.next = next;
            if (next != null) {
                next.prev = node1;
            }
        } else if (node2.next == node1) { // node2 before node1
            Node prev = node2.prev;
            Node next = node1.next;

            if (prev != null) {
                prev.next = node1;
            }
            node1.prev = prev;

            node1.next = node2;
            node2.prev = node1;

            node2.next = next;
            if (next != null) {
                next.prev = node2;
            }
        } else { // non-adjacent nodes
            Node prev1 = node1.prev, next1 = node1.next;
            Node prev2 = node2.prev, next2 = node2.next;

            if (prev1 != null) {
                prev1.next = node2;
            }
            if (next1 != null) {
                next1.prev = node2;
            }
            node2.prev = prev1;
            node2.next = next1;

            if (prev2 != null) {
                prev2.next = node1;
            }
            if (next2 != null) {
                next2.prev = node1;
            }
            node1.prev = prev2;
            node1.next = next2;
        }

        // Step 3: Update head if needed
        if (head == node1) {
            head = node2;
        } else if (head == node2) {
            head = node1;
        }

        System.out.println("Swapped nodes " + val1 + " and " + val2);
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
