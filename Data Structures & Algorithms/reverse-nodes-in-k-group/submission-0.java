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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode newHead = null;

        Stack<ListNode> stack = new Stack<>();

        while(curr!=null){
            ListNode check = curr;
            int count = 0;
            while (count < k && check != null) {
                check = check.next;
                count++;
            }
            if (count < k) {
                if (prev != null) prev.next = curr;
                if (newHead == null) newHead = head;
                break;
            }

            int r = k;
            while(r>0 && curr != null){
                stack.push(curr);
                curr=curr.next;
                r--;
            }

           if(prev==null){
              newHead=stack.pop();
              prev = newHead;
           }else{
              prev.next = stack.pop();
              prev = prev.next;
           }

           while(!stack.isEmpty()){
              prev.next = stack.pop();
              prev=prev.next;
           }
           prev.next = curr;
        }

        return newHead;
    }
}