package StackAndQueue.queue;

public class QueueMain {

    public static void main(String[] args) throws Exception {
       /* CustomQueue queue = new CustomQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.display();
        System.out.println("Removed item = "+queue.offer());
        queue.display();*/

        CircularQueue circularQueue = new CircularQueue();
        circularQueue.addItem(1);
        circularQueue.addItem(3);
        circularQueue.addItem(5);
        circularQueue.addItem(7);
        circularQueue.addItem(9);
        circularQueue.display();
        circularQueue.addItem(100);
        circularQueue.display();
        System.out.println("Removed item = "+circularQueue.removeItem());
        circularQueue.display();
    }
}
