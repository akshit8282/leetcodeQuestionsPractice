class Solution {
    public int maxSubArray(int[] nums) {
    
 int left = 0;
    int max = Integer.MIN_VALUE;
    int sum =0;
    for(int right =0; right<nums.length;)
    {
        sum += nums[right];     // Keeping Sum of all Elements inside range Right - left
        max = Math.max(max,sum); // Finding Max
        while(sum<0)            // If Sum is less then 0 
        {
            sum-=nums[left++];  // Inc the left pointer , and remove its value from Sum. 
        }            
        right++;            
    }
    return max;
}
}
