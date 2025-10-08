public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 =new LinkedList();

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



    

       
    }
}
