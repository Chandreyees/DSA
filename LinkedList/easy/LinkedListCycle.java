package LinkedList.easy;

import LinkedList.*;
import LinkedList.medium.DetectNodeOfLLCycle;

import java.util.HashMap;
import java.util.Scanner;

import static LinkedList.easy.MergeSortedLinkedList.takeInput;

public class LinkedListCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for the linked list. Type 'false' to stop:");
        LinkedList list = takeInput(sc);
        LinkedList.display(list.head);

        System.out.println(hasCycle(list.head));
        DetectNodeOfLLCycle detectNode = new DetectNodeOfLLCycle();
        System.out.println(detectNode.detectCyle(list.head));
        if(hasCycle(list.head))
            System.out.println("Length of the cycle: "+lengthOfCycle(list.head));
    }

    private static int lengthOfCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int ans =0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                ans+=1;
                while(slow!=fast)
                {
                    slow = slow.next;
                    ans++;
                }
                break;
            }
        }
        return ans;
    }

    private static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }


}
