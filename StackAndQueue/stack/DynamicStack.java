package StackAndQueue.stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int value){
        if(isFull()){
          int temp[] = new int[data.length*2];
          //copy prev items
            int i=0;
            for(;i<data.length;i++)
                temp[i] = data[i];
            data = temp;
        }
       return super.push(value);
    }
}
