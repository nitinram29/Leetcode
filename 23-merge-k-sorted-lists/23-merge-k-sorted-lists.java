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
        
        Queue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);
        
        for(ListNode i:lists)
            if(i!=null)
               q.add(i);
        
        ListNode tmp = new ListNode(-1);
        ListNode ans=tmp;
        while(!q.isEmpty()){
            ListNode t = q.poll();
            tmp.next = new ListNode(t.val);
            tmp=tmp.next;
            if(t.next!=null)
                q.add(t.next);            
        }
        return ans.next;        
    }
}