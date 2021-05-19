class Solution {
    public String sortSentence(String s) {
      String[] ch=s.split(" ");
        String ch2[]=new String[ch.length+1];
        for(String si:ch){
            int a=Character.getNumericValue(si.charAt(si.length()-1));
            ch2[a]=si;
        }
        StringBuilder finalr=new StringBuilder();
        for(int i=1;i<ch2.length;i++){
           
            StringBuilder sb=new StringBuilder();
            sb.append(ch2[i]);
           
sb.deleteCharAt(sb.length()-1);
            finalr.append(sb.toString());
            finalr.append(" ");
            
        }
        return finalr.toString().trim();
        
    }
}