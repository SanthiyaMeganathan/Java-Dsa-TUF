class Node{

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next= null;
    }

}

class LinkedList{

    Node head;

    //function to insert at begniing:

    public void insertAtBeginning(int value){

        Node newNode = new Node(value);
        newNode.next =head;
        head=newNode;
       
    }

    public void printlist(){
        Node temp =head;

        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }


}