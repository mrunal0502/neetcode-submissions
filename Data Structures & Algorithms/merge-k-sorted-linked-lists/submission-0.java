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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for(ListNode node : lists){
            if(node!=null){
                pq.offer(node);
            }
        }

        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            if(node.next!=null) pq.offer(node.next);
            temp.next = node;
            temp = node;
        }

        return dummy.next;

    }
}
