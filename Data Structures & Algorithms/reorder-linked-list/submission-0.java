/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(l2!=null){
            ListNode node = l2;
            l2=l2.next;
            node.next = prev;
            prev = node;
        }

        l2 = prev;
        ListNode temp = l1;
        l1=l1.next;

        boolean odd = false;

        while(l1!=null && l2!=null){
           if(odd){
              temp.next=l1;
              temp=temp.next;
              l1=l1.next;
              odd = false;
           }else{
              temp.next = l2;
              temp=temp.next;
              l2=l2.next;
              odd = true;
           }

        }

        while(l1!=null){
            temp.next = l1;
            temp = temp.next;
            l1=l1.next;
        }

        while(l2!=null){
            temp.next = l2;
            temp = temp.next;
            l2=l2.next;
        }


    }
}
