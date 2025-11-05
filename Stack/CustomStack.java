
public class CustomStack{

    protected int[] data;
    private static final int DEFAULT_VALUE=10;
    //pointer we use to insert or remove from the stack:

    int ptr= -1;

    public CustomStack(){
        this(DEFAULT_VALUE);
    }


    public CustomStack(int size){
        this .data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;

        }
        ptr++;
        data[ptr]=item;
        return true;

    }

    //first element.

    public int peek() throws  Exception{

        if(isEmpty()){
            throw new Exception("the stack is emptty");
        }

        return data[ptr];
    }

    public int pop() throws  Exception{

        if(isEmpty()){
            throw new Exception("can not pop frm empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

    }

    public boolean isFull(){
        return ptr == data.length-1;//ptr is in last index.
        
    }

    // when stack is empty:

    public boolean isEmpty(){
        return ptr==-1;
    }



   
}