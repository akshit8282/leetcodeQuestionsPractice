class Solution {
    public int minOperations(int n) {
		int ans =0;
        if(n==0){
            return 0;
        }
      for(int i=0;i<n/2;i++){
         ans+=n-(i*2+1);
      }
        return ans;
    }
}