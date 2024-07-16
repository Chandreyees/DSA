package LinkedList;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val){
        this.val = val;
    }
    public ListNode(ListNode next){
        this.next=next;
    }
    public ListNode(int val, ListNode next, ListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public ListNode(int val, ListNode currentListNode) {
        this.val=val;
        this.next=currentListNode;
    }

    public ListNode() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
