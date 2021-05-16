class Solution {
    public boolean rotateString(String s, String goal) {
       
        if(s.length()!=goal.length()){
            return false;
        }
         if(s.length()==0){
            return true;
        }
        if(s.equals(goal)){
            return true;
        }
   for(char i:s.toCharArray()){
       String firstletter=s.substring(0,1);
       String otherletter=s.substring(1,s.length());
        s=otherletter+firstletter;
       
       if(s.equals(goal)){
           return true;
       }
   }
        return false;
    }
}
