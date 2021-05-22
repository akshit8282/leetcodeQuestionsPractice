import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
    Deque<Integer> q=new LinkedList<>();
        int i=0;
        int s=a.length;
        int[] ans=new int[s-k+1];
        if(s<=1){
            return a;
        }
        for(i=0;i<k;i++){
            while(!q.isEmpty()&&a[i]>=a[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        
        for( ;i<s;i++){
            ans[i-k]=a[q.peekFirst()];
            while(!q.isEmpty()&&q.peekFirst()<=i-k){
                q.removeFirst();
                
            }
             while(!q.isEmpty()&&a[i]>=a[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
            
        }
        ans[i-k]=a[q.peekFirst()];
        return ans;
    }
}