
class Solution {
    public int romanToInt(String s) {
        char[] ch=s.toCharArray();
    
    HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
         mp.put('V',5);
         mp.put('X',10);
         mp.put('L',50);
         mp.put('C',100);
         mp.put('D',500);
         mp.put('M',1000);
        
        int sum=mp.get(ch[s.length()-1]);
        int max=mp.get(ch[s.length()-1]);
        for(int i=s.length()-2;i>=0;i--){
            if(mp.get(ch[i])>=max){
                max=mp.get(ch[i]);
                sum=sum+max;
            }else{
                max=mp.get(ch[i]);
                sum=sum-max;
            }
        }
        return sum;
    }
}