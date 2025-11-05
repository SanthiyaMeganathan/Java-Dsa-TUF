public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    // we dont hae problem in peak , pop . 
    //we have to focus on push.
    // becuase in dynamic it will never be full.

    @Override

    public boolean  push(int item){

        if(isFull()){

            int[] temp = new int[data.length *2];

            for(int i =0; i<data.length; i++){
                temp[i]=data[i];
            }

            data=temp;
        }

        return super.push(item);
    }


   
}