class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
       k=k%nums.length;
     reverse(nums,0,n-1-k);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        
    }
    public static void reverse(int[] a,int s,int l){
        while(s<l){
            
            int temp=a[l];
            a[l]=a[s];
            a[s]=temp;
            s++;
            l--;
        }
    }
}
