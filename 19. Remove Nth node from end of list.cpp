/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        int len = 0;
        ListNode *t = head;
        while(t!=NULL){
            len++;
            t=t->next;
        }
        if(n==len) return head->next;
        t = head;
        int ans = len-n-1;
        while(ans){
            
            if(t!=NULL)
            t = t->next;
            ans--;
        }
        t->next=t->next->next;
        return head;
        
        
    }
};