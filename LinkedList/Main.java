public class Main {
    public static void main(String[] args) {
        //list we used to insert at front:
        LinkedList list = new LinkedList();
        // list we used to insert at end and anywhere
        LinkedList list1 =new LinkedList();
        //list we use to check what will happen will the list is empty and we try to remove anything:
        //null list;
        LinkedList list2 = new LinkedList();
        //list we use to check what if we remove the first element
        LinkedList list3 = new LinkedList();
        //list to check to deletefrom end when list as one element:
      

        list.insertAtBeginning(10);
        list.insertAtBeginning(12);
        list.insertAtBeginning(13);

        System.out.println("The elements in the Linked List");
        list.printlist();

        System.out.println("Elements which is begining insterin end");

        list1.insertAtEnd(2);
        list1.insertAtEnd(4);
        list1.insertAtEnd(5);

        System.out.println("Elements in the List1;  ");

        list1.printlist();

        System.out.println("Enter the element at any position");
        list1.insertAtAnyPosition(8);

        
        list1.printlist();

        list2.deleteBeginning();

        //inserting to list3 to check:

        list3.insertAtBeginning(1);
        list3.insertAtBeginning(2);
        list3.insertAtBeginning(3);
        list3.insertAtBeginning(4);

        System.out.println("The list 3 before deleting at beginning");

        list3.printlist();

        list3.deleteBeginning();

        System.out.println("The list 3 before deleting at beginning");

        list3.printlist();

        LinkedList list4 = new LinkedList();
        LinkedList list5 = new LinkedList();

        //list to check to delete from end:
        LinkedList list6 = new LinkedList();

        list4.deleteAtEnd();

        list5.insertAtBeginning(1);

       list5.printlist();

       list5.deleteAtEnd();

       list6.insertAtEnd(2);
        list6.insertAtEnd(3);
         list6.insertAtEnd(4);
          list6.insertAtEnd(6);
           list6.insertAtEnd(7);

           System.out.println("bf deletion");

           list6.printlist();
           list6.deleteAtEnd();

           System.out.println("after deletion");
           list6.printlist();

        




    

       
    }
}
