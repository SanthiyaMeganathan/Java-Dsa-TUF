
class DMain {

    public static void main(String[] args) {
        // 
        // DoublyLinkedList list = new DoublyLinkedList();
        // //printing when list as nothing;

        // System.out.println("PRINTING WHEN LIST AS NOTHING");
        // list.printNode();
        // //first elemennt:
        // System.out.println("we are adding the fisrt element");
        // list.addFirstNode(19);
        // System.out.println();
        // System.out.println("Printing the list after adding the first element");
        // list.printNode();
        // System.out.println("");
        // System.out.println("THe above element is the fisrt element of the list");
        // //list to implement add the elemnt at the head :
        // DoublyLinkedList list1 = new DoublyLinkedList();
        // list1.addAtBeginning(2);
        // list1.addAtBeginning(3);
        // list1.addAtBeginning(9);
        // list1.addAtBeginning(6);
        // list1.addAtBeginning(11);
        // System.out.println("THe list which is created using doubly linked list");
        // list1.printNode();
        // //list to add at end:
        // DoublyLinkedList list2 = new DoublyLinkedList();
        // list2.addAtEnd(3);
        // list2.addAtEnd(6);
        // list2.addAtEnd(9);
        // list2.addAtEnd(12);
        // list2.addAtEnd(15);
        // System.out.println("The doubly linked list when the linked list is created by adding new node to end");
        // list2.printNode();
        // // list to add ever wher i want:
        // DoublyLinkedList list3 = new DoublyLinkedList();
        // list3.addAtEnd(5);
        // list3.addAtEnd(10);
        // list3.addAtEnd(15);
        // list3.addAtEnd(20);
        // list3.addAtEnd(25);
        // list3.addAtEnd(30);
        // System.out.println("");
        // System.out.println("The list before inserting in given position");
        // list3.printNode();
        // list3.addAtAnywhere(988);
        // System.out.println("");
        // System.out.println("The list after adding element in particular position");
        // list3.printNode();
        // //list to delete the element at the start:
        // DoublyLinkedList list4 = new DoublyLinkedList();
        // list4.deleteAtStart();
        // list4.addAtEnd(2);
        // System.out.println("");
        // System.out.println("the element we have in the list:");
        // System.out.println("");
        // list4.printNode();
        // System.out.println("The list after we deleting the first node when we have only one node");
        // list4.deleteAtStart();
        // list4.printNode();
        // //adding more elements to the list:
        // list4.addAtEnd(30);
        // list4.addAtEnd(40);
        // list4.addAtEnd(50);
        // list4.addAtEnd(60);
        // list4.addAtEnd(70);
        // System.out.println("");
        // System.out.println("The list before deleting the first element");
        // list4.printNode();
        // list4.deleteAtStart();
        // System.out.println("");
        // System.out.println("The list after deleting the fisrt element");
        // list4.printNode();
        // System.out.println("");
        // System.out.println("Again perfirming the deleting of the first node");
        // list4.deleteAtStart();
        // System.out.println("");
        // System.out.println("The list after deletion performed for 2nd time");
        // list4.printNode();
        //list to check the deleteat end:
        DoublyLinkedList list5 = new DoublyLinkedList();

        System.err.println("deleting when the list as nothing");

        list5.deleteAtEnd();

        System.out.println("Adding the elements to list: only one element");

        list5.addAtEnd(234);

        System.out.println("The list has only one element and this is befor deleting anything");

        list5.printNode();

        System.out.println("Performing the deletion");

        list5.deleteAtEnd();

        System.out.println("the list after deleting the element. but it will not have any thing since we had only one element in our list");

        list5.addAtEnd(234);
        list5.addAtEnd(344);
        list5.addAtEnd(534);
        list5.addAtEnd(634);
        list5.addAtEnd(734);

        System.out.println("our list after adding 5 elements");
        list5.printNode();

        System.out.println("");
        System.out.println("deleting the last node");
        list5.deleteAtEnd();
        System.out.println("");
        System.out.println("The list after deleting the last elemnt");
        list5.printNode();

    }
}
