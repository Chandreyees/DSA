package StackAndQueue.stack;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        else
        {
            ptr++;
            data[ptr] = value;
        }
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
           throw new Exception("Cannot remove item from empty Stack");
        }
       return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty!!!");
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr==-1;
    }

    private boolean isFull() {
        return ptr==data.length-1;
    }
}
