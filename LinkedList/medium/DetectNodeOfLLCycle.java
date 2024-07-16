package LinkedList.medium;

import LinkedList.ListNode;

public class DetectNodeOfLLCycle {

    public ListNode detectCyle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                ListNode start = head;
                while(slow!=start){
                    slow = slow.next;
                    start=start.next;
                }
                return start;
            }
        }
        return null;
    }
}
