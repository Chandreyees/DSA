package LinkedList.medium;

import LinkedList.LinkedList;
import LinkedList.ListNode;

import java.util.Scanner;

import static LinkedList.easy.MergeSortedLinkedList.takeInput;

public class SortLinkedList {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Linked List: ");
        LinkedList list = takeInput(sc);
        System.out.println("Original List: ");
        LinkedList.display(list.head);
        //ListNode head = sortList(list.head);
//        ListNode head = bubbleSortList(list.head);
        bubbleSortListRecur(0,list.size-1,list);
        System.out.println("After sorting");
        LinkedList.display(list.head);
    }

    private static ListNode bubbleSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = getLength(head);
        for(int i=0;i<length-1;i++){
            ListNode current = head;
            ListNode next = current.next;
            for (int j=i+1;j<length;j++){
                if(current.val>next.val){
                    int temp = current.val;
                    current.val = next.val;
                    next.val = temp;
                }
                current = current.next;
                next = next.next;
            }
        }
        return head;
    }

    private static void bubbleSortListRecur(int col,int row,LinkedList list) {
       if(row==0)
           return;
       if(col<row){
           ListNode first = list.getNode(col);
           ListNode second = list.getNode(col+1);
           if(first.val>second.val)
               swapNodes(first,second,list,col);
           bubbleSortListRecur(col+1,row,list);
       }
       else
           bubbleSortListRecur(0,row-1,list);
    }

    private static void swapNodes(ListNode first, ListNode second, LinkedList list, int col) {
        //case 1
        if(first==list.head)
        {
            list.head = second;
            first.next = second.next;
            second.next = first;
        }

        //case 2
        else if(second==list.tail){
            ListNode prev = list.getNode(col-1);
            prev.next = second;
            list.tail = first;
            first.next = null;
            second.next = list.tail;
        }

        //case 3
        else{
            ListNode prev = list.getNode(col-1);
            prev.next = second;
            first.next = second.next;
            second.next = first;
        }
    }

    private static int getLength(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    private static ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }

    private static ListNode merge(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode current = head;
        while(left!=null && right!=null){
            if(left.val<=right.val)
            {
                current.next = left;
                left = left.next;
            }
            else {
                current.next = right;
                right = right.next;
            }
            current=current.next;
        }

        current.next=left!=null?left:right;
        return head.next;
    }

    private static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the node before the midpoint

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Break the list into two halves
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }
}
