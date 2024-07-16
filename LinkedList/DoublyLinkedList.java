package LinkedList;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode node;
    private int size;

    public DoublyLinkedList(ListNode head, ListNode node, int size) {
        this.head = head;
        this.node = node;
        this.size = size;
    }

    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.setNext(head);
        node.setPrev(null);
        if(head!=null)
            head.setPrev(node);
        head = node;
        size+=1;
    }

    public void insertLast(int val){
        if(size==0) {
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        node.setNext(null);
        ListNode temp = head;
        while(temp.getNext() !=null)
            temp = temp.getNext();
        temp.setNext(node);
        node.setPrev(temp);
        size+=1;
    }

    public void insertAtIndex(int val, int index){
        if(index==1){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        ListNode node = new ListNode(val);
        ListNode temp = head;
        for(int i=1; i<index-1;i++){
            temp = temp.getNext();
        }
        node.setNext(temp.getNext());
        node.setPrev(temp);
        temp.setNext(node);
    }

    public void deleteFirst(){
        if(size==0)
            return;
        ListNode temp = head.getNext();
        head.setNext(null);
        head = temp;
        head.setPrev(null);
        size-=1;
    }

    public void deleteLast(){
        ListNode temp = head;
        while(temp.getNext().getNext() !=null)
            temp = temp.getNext();
        temp.getNext().setPrev(null);
        temp.setNext(null);
        size-=1;
    }

    public void deleteFromIndex(int index){
        ListNode temp = head;
        for(int i=1;i<index-1;i++)
            temp= temp.getNext();
        ListNode temp2 = temp.getNext().getNext();
        temp.getNext().setNext(null);
        temp.getNext().setPrev(null);
        temp2.setPrev(temp);
        temp.setNext(temp2);
        size-=1;
    }

    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.getVal() +" -> ");
            temp= temp.getNext();
        }
        System.out.println("END");
    }

    public void displayInReverse(){
        System.out.println("DoublyLinkedList in Reverse: ");
        ListNode temp = head;
        while(temp.getNext() !=null)
            temp = temp.getNext();
        while(temp!=null){
            System.out.print(temp.getVal() +" -> ");
            temp = temp.getPrev();
        }
        System.out.println("END");
    }
}
