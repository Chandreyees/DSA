package LinkedList.easy;

import LinkedList.ListNode;

import java.util.Scanner;

public class RemoveDuplicates {

    public ListNode removeDuplicates(ListNode head){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        if(head==null)
            return head;
        ListNode start = head;
        ListNode temp = head;
        while(temp!=null){
            if(start.val==temp.val)
                temp=temp.next;
            else {
                start.next = temp;
                start = start.next;
            }
        }
        start.next = temp;
        return head;
    }

}
