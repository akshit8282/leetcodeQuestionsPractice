class Solution {
    public int firstMissingPositive(int[] nums) {
        
    if(nums.length<1)return 0;
        TreeSet set=new TreeSet();
        for(int num:nums)
            set.add(num);
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!set.contains(i))
                return i;
        }
       return nums[nums.length-1]+1;
        
    }
}
