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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head,t=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        for(int i=0;i<c/2;i++){
            t=t.next;
        }
        return t;
    }  
    }