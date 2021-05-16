class Solution {
    public int[] twoSum(int[] nums, int target) {
    int sum=0,i=0;
       Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i]))
            {
                return new int[] {i,m.get(target-nums[i])};
            }
            m.put(nums[i],i);
        }
        return new int[0];
    }
}
