class Solution {
    public String reverseVowels(String s) {
    int i=0;
        int j=s.length()-1;
        char si[]=s.toCharArray();
        while(i<j){
            if(isVowel(si[i])&&isVowel(si[j])){
                char temp=si[i];
                si[i]=si[j];
                si[j]=temp;
                i++;
                j--;
            }
            else {
                if(!isVowel(si[i])){
                    i++;
                }
                if(!isVowel(si[j])){
                    j--;
                }
            }
        }
        return String.valueOf(si);
        
    }
    public boolean isVowel(char c){
          return c=='a'||c=='e'|| c=='i'||c=='o'|| c=='u'||c=='A'||c=='E'|| c=='I'||c=='O'|| c=='U';
    }
}
