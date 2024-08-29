package StackAndQueue.queue;

public class CircularQueue {

    private int size;
    protected int front=0;
    protected int end=0;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    private boolean isEmpty() {
        return size==0;
    }

    protected boolean isFull() {
        return size==data.length;
    }

    public boolean addItem(int value) throws Exception {
        if(isFull())
            throw new Exception("Circular Queue is full!!!");
        data[end++] = value;
        end = end%data.length;
        size++;
        return true;
    }

    public int removeItem() throws Exception {
        if(isEmpty())
            throw new Exception("Circular Queue is empty!!!");
        int removedItem = data[front++];
        front = front%data.length;
        size--;
        return removedItem;
    }

    public void display(){
        int i=front;
        do {
            System.out.print(data[i]+" -> ");
            i++;
            i%=data.length;
        }while (i!=end);
        System.out.println("END");
    }
}
