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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        ListNode temp=head;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int i=1;
        while(temp!=null){
            mp.put(i,temp.val);
            i++;
            temp=temp.next;
        }
        for(int e=1;e<=i/2;e++){
            if(mp.get(e)!=mp.get(i-e)){
                return false;
            }
        }
        return true;
       
    }
}