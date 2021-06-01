class Solution {
    List<String> a=new ArrayList<>();
    public String getHappyString(int n, int k) {
        String s="abc";
        helper(s,n,"");
        if(a.size()<k){
            return "";        }
        return a.get(k-1);
    }
    public void helper(String s,int len,String curr){
        if(curr.length()==len){
            a.add(curr);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            if(curr.length()>0&&curr.charAt(curr.length()-1)==s.charAt(i)){
                continue;
            }
            helper(s,len,curr+s.charAt(i));
        }
    }
}
