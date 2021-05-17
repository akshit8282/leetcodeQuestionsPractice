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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if(l1==null && l2==null){
        return null;
    }
        ListNode f=new ListNode();
        ListNode arr=f;
        ListNode temp1=l1;
        ListNode temp2=l2;
    
    while(temp1!=null && temp2!=null){

      if(temp1.val==temp2.val){
            arr.val=temp1.val;
            arr.next=new ListNode();
            arr.next.val=temp2.val;
                  
            arr=arr.next;
            temp1=temp1.next;
            temp2=temp2.next;
            
        }else if(temp1.val>temp2.val){
             arr.val=temp2.val;
            
            temp2=temp2.next;
            
        }else if(temp1.val<temp2.val){
             arr.val=temp1.val;
           
            temp1=temp1.next;
            
        }
        
        if(temp1!=null || temp2!=null){
           arr.next=new ListNode();
            arr=arr.next;
        }
    }
     while(temp1!=null){
         
          arr.val=temp1.val;
         
          temp1=temp1.next;
         if(temp1!=null){
            arr.next=new ListNode();
            arr=arr.next;     
         }
         
     }
     while(temp2!=null){
         
          arr.val=temp2.val;
             
          temp2=temp2.next;
          if(temp2!=null){
            arr.next=new ListNode();
            arr=arr.next;     
         }
         
     }
       
       return f;

    }
}