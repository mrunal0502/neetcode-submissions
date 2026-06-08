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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;;

        while(temp1!=null||temp2!=null||carry>0){
            int sum = (temp1==null?0:temp1.val) + (temp2==null?0:temp2.val) + carry;
            carry = sum/10;

            ListNode node = new ListNode(sum%10);

            if(prev==null){
                prev = node;
            }else{
                prev.next = node;
                prev = node;
            }

            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }

        return dummy.next;

    }
}
