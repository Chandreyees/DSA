package LinkedList.medium;

import LinkedList.LinkedList;
import LinkedList.ListNode;

import java.util.Scanner;

import static LinkedList.easy.MergeSortedLinkedList.takeInput;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Linked List: ");
        LinkedList list = takeInput(sc);
        System.out.println("Original List: ");
        LinkedList.display(list.head);
        reverseLinkedList(list);
        System.out.println("Reversed Linked List: ");
        LinkedList.display(list.head);
    }

    //using recursion
   /* private static void reverseLinkedList(ListNode node,LinkedList list) {
        if(node==list.tail) {
            list.head=list.tail;
            return;
        }
        reverseLinkedList(node.next,list);
        list.tail.next=node;
        list.tail = node;
        list.tail.next=null;
    }*/

    //using iteration
    private static void reverseLinkedList(LinkedList list) {
        ListNode prev = null;
        ListNode current = list.head;
        ListNode next = current.next;
        while(current!=null){
            current.next = prev;
            prev = current;
            current=next;
            if(next!=null)
            next = next.next;
        }
        list.head = prev;
    }

}
