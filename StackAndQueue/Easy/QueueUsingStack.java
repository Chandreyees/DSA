package StackAndQueue.Easy;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty())
            second.push(first.pop());
        int removedItem = second.pop();
        while(!second.isEmpty())
            first.push(second.pop());
        return removedItem;
    }

    public int peek() {
        while(!first.isEmpty())
            second.push(first.pop());
        int peekedItem = second.peek();
        while(!second.isEmpty())
            first.push(second.pop());
        return peekedItem;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
