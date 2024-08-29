package StackAndQueue.Easy;

import java.util.Stack;

public class ImplementQueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueUsingStack(Stack<Integer> first, Stack<Integer> second) {
        this.first = first;
        this.second = second;
    }

    public ImplementQueueUsingStack() {
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
