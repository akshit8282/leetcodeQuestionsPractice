
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
/*
	int result = 0;
        for (char c : s.toCharArray()) {
        	if (c == 'I')
        		result += 1;
        	else if (c == 'V')
        		result += 5;
        	else if (c == 'X')
        		result += 10;
        	else if (c == 'L')
        		result += 50;
        	else if (c == 'C')
        		result += 100;
        	else if (c == 'D')
        		result += 500;
        	else if (c == 'M')
        		result += 1000;
        }
        
        if (s.contains("IV") || s.contains("IX"))
			result -= 2;
        if (s.contains("XL") || s.contains("XC"))
			result -= 20;
        if (s.contains("CD") || s.contains("CM"))
			result -= 200;
        
        return result;
*/