package LinkedList;

public class CircularLinkedList {

    public ListNode head;
    public ListNode tail;
    public int size;

    public CircularLinkedList() {
    }

    public void insertAtFirst(int val){
        ListNode node = new ListNode(val);
        if(head==null)
        {
            head = node;
            tail= node;
            size+=1;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
        size+=1;
    }

    public void delete(int val){
        if(head == null)
            return;
        if(head.val==val)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        for(ListNode temp = head; temp!=tail;temp=temp.next){
            if(temp.next.val==val){
                temp.next = temp.next.next;
            }
        }
    }

    public void display(){
        ListNode temp = head;
        do {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }while (temp!=head);
        System.out.println("HEAD");
    }
}
