package xyz.zxcwxy999.Offer.No06;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public int[] reversePrint(ListNode head) {
        int i = 0;
        head = reverseList(head);
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            i++;
        }
        int[] a = new int[i];
        curr = head;
        i = 0;
        while (curr != null) {
            a[i] = curr.val;
            curr = curr.next;
            i++;
        }
        return a;
    }
}