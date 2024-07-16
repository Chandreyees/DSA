package LinkedList;

public class LinkedList {

    public ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public LinkedList(ListNode head) {
        this.head = head;
    }

    public LinkedList(ListNode head, ListNode tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.setNext(head);
        head=node;
        if(tail==null)
            tail = head;
        size+=1;
    }

    public void insertLast(int val){
        if(tail == null)//linked list is empty
        {
            insertFirst(val);
            return;
        }
        ListNode ListNode = new ListNode(val);
        tail.setNext(ListNode);
        ListNode.setNext(null);
        tail = ListNode;
        size+=1;
    }

    public void insertAtPosition(int val,int position){
        if(position==1)
        {
            insertFirst(val);
            return;
        }
        if(position==size)
        {
            insertLast(val);
            return;
        }
        ListNode ListNode = new ListNode(val);
        ListNode temp = head;
        while(position>1){
            temp= temp.getNext();
            position-=1;
        }
        ListNode.setNext(temp.getNext());
        temp.setNext(ListNode);
        size+=1;
    }

    public void insert(int val,int index){
        ListNode temp = head;
        insert(val,index,temp);
    }

    private ListNode insert(int val,int index,ListNode currentListNode){
        if(index==0) {
            size+=1;
            return new ListNode(val,currentListNode);
        }
        currentListNode.setNext(insert(val, index - 1, currentListNode.getNext()));
        return currentListNode;
    }

    public void removeDuplicates(){
        if(head==null)
            return;
        ListNode start = head;
        ListNode temp = head;
        while(temp!=null){
           if(start.getVal() == temp.getVal())
               temp= temp.getNext();
           else {
               start.setNext(temp);
               start = start.getNext();
           }
        }
        start.setNext(temp);
    }

    public void deleteFirst(){
        if(size==0)
            return;
        ListNode temp = head.getNext();
        head.setNext(null);
        head=temp;
        size-=1;
    }

    public void deleteLast(){
        if(head==tail)
        {
            deleteFirst();
            return;
        }
        ListNode temp = head;
        while(temp.getNext() !=tail)
            temp= temp.getNext();
        temp.setNext(null);
        size-=1;
    }

    public void deleteFromPosition(int index){
        if(index==1){
            deleteFirst();
            return;
        }
        if(index==size)
        {
            deleteLast();
            return;
        }
        ListNode temp = head;
        for(int i = 1; i<index-1; i++){
            temp= temp.getNext();
        }
        temp.next = temp.next.next;
        size-=1;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
}
