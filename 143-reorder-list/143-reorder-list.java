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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;            
        }         
        ListNode prev = null;
        ListNode h1 = slow.next;
        slow.next=null;
        
        ListNode next = null;
        while(h1!=null){
            next = h1.next;
            h1.next = prev;
            prev = h1;
            h1 = next;            
        }
        h1 = prev;
        ListNode tmp = head;
        int f=0;
        while(h1!=null){
            if(f==0){
                ListNode t = tmp;
                tmp = tmp.next;   
                t.next = h1;
                f=1;                
            }else{
                ListNode t = h1;
                h1 = h1.next;
                t.next = tmp;
                f=0;
            }  
        }         
    }
}