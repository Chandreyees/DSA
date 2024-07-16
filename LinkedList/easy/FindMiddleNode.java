package LinkedList.easy;

import LinkedList.LinkedList;
import LinkedList.*;
import LinkedList.medium.DeleteMiddle;

import java.util.Scanner;
import static LinkedList.easy.MergeSortedLinkedList.takeInput;

public class FindMiddleNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements, Type false for ending");
        LinkedList list = takeInput(sc);
        LinkedList.display(list.head);

        System.out.println("Middle Node value: "+middleNode(list.head).val);
        DeleteMiddle ob = new DeleteMiddle();
        ListNode node=ob.deleteMiddle(list.head);
        LinkedList.display(node);
    }

    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
