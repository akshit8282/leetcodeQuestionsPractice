class Solution {
    public int majorityElement(int[] a) {
      Map<Integer,Integer> m=new HashMap<>();
       for(int i:a){
           m.put(i,m.getOrDefault(i,0)+1);
       }
        for(int i:a){
         if(m.get(i)>(a.length/2)){
             return i;
         }
       }
        return 0;
    }
}
