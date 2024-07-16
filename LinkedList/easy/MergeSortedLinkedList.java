package LinkedList.easy;

import LinkedList.LinkedList;
import LinkedList.ListNode;

import java.util.Scanner;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for the first linked list. Type 'false' to stop:");
        LinkedList list1 = takeInput(sc);

        System.out.println("Enter elements for the second linked list. Type 'false' to stop:");
        LinkedList list2 = takeInput(sc);
        LinkedList.display(list1.head);
        LinkedList.display(list2.head);
        ListNode node = mergeTwoLists(list1.head,list2.head);
        System.out.println("The merged list : ");
        LinkedList.display(node);
    }

    public static LinkedList takeInput(Scanner sc) {
        LinkedList list = new LinkedList();
        while (true) {
            System.out.print("Enter element (or 'false' to stop): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("false")) {
                break;
            }
            try {
                int val = Integer.parseInt(input);
                list.insertLast(val);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'false' to stop.");
            }
        }
        return list;
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode ansNode = head;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val){
                ansNode.next = list1;
                list1 = list1.next;
            }
            else if(list2.val<list1.val){
                ansNode.next = list2;
                list2 = list2.next;
            }
            ansNode = ansNode.next;
        }
       if(list1!=null)
           ansNode.next=list1;
       else if(list2!=null)
           ansNode.next=list2;
        return head.next;
    }
}
