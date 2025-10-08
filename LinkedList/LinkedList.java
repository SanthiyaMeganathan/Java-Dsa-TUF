import java.util.*;


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
    Node tail;

    //function to insert at begniing:

    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next =head;
        head=newNode;
       
    }

    //function to insert the node at end:

    public void insertAtEnd(int value){   
        Node newNode = new Node(value);
        if(head==null){
            newNode.next=head;
            head=newNode;
            tail=newNode;
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
        tail=newNode;
    }

    //insert at any postion:
    public void insertAtAnyPosition(int value){
        Node newNode = new Node( value);
        System.out.println("Enter the position you want to insert the element in the list");
        Scanner input = new Scanner(System.in);
        int position =input.nextInt();      
        int count =1;
        Node temp1=head;
        Node temp =head;
        while(temp1.next!=null){
            count = count+1;
            temp1=temp1.next;
        }
        if(position>=count){
            temp1.next=newNode;
            tail=newNode;
            
        }else if(position<=0){
            newNode.next=head;
            head=newNode;
        }       
        else{
        int index=0;
        Node first=head;
        Node last=head.next;
        while(index<position){

            first=temp;
            last=temp.next;
            temp = temp.next;
            index=index+1;
        }
        first.next =newNode;
        newNode.next=last;
        }
   
    }

    //delete from begining:

    public void deleteBeginning(){
        
        if(head ==null){
            System.out.println(" ");
            System.out.println("There is nothing to delete");
            return;
        }

        head =head.next;
    }

    //delete at end:

    public void deleteAtEnd(){

        Node temp=head;
        Node lastBefore =head;
        

        if(head==null){
            System.out.println("There is nothing to delete");
            return;
        }else if(head.next==null){
            System.out.println("You had only one element that too deleted");
            head=null;
            return;
            

        }else{
            while(temp.next!=null){
                lastBefore=temp;
                temp =temp.next;
            }

          
            lastBefore.next=null;

            System.out.println("one element dleted from last");
        }
        
    }

    
    //to print the elements in linked list;

    public void printlist(){
        Node temp =head;

        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }


}