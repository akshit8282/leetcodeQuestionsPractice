class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
    if(s1.equals(s2)){
        return true;
    }
        if(s1.length()!=s2.length()){
            return false;
        }
        int c=0;
       for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)!=s2.charAt(i)){
               c++;
           }
       }
        char[] ch=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        s1=String.valueOf(ch);
        s2=String.valueOf(ch2);
        
        if((c==0||c==2)&&s1.equals(s2)){
            return true;
        }
        return false;
    }
}
