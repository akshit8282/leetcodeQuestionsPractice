
class Solution {
    public int balancedStringSplit(String s) {
        int l=0;
        int r=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
            }else{
                l++;
            }
            if(l==r){
                c++;
                l=0;r=0;
            }
        }
        return c;
    }
}