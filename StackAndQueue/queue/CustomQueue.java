package StackAndQueue.queue;

import java.util.Queue;

public class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public void add(int item) throws Exception {
        if(isFull())
            throw new Exception("Queue is full!!");
        data[end++] = item;
    }

    public int offer() throws Exception {
        if(isEmpty())
            throw new Exception("Queue is empty!!!!!");
        int removedItem = data[0];
        //shift the elements
        for(int i=0;i<data.length-1;i++)
            data[i] = data[i+1];
        end--;
        return removedItem;
    }

    public int poll() throws Exception {
        if(isEmpty())
            throw new Exception("Queue is empty!!!!!");
       return data[0];
    }

    public void display(){
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println("END");
    }

    private boolean isEmpty() {
        return end==-1;
    }

    private boolean isFull() {
        return end==data.length;
    }
}
