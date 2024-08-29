package StackAndQueue.queue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue() {
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean addItem(int value) throws Exception {
        int temp[] = new int[data.length*2];
        if(isFull())
        {
            //copy original array
            for(int i=0;i<data.length;i++){
                temp[i] = data[(front+i)%data.length];
            }
            data = temp;
            front = 0;
            end = data.length;
        }
        return super.addItem(value);
    }
}
