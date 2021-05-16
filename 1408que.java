class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> a=new ArrayList<>();
      for(int i=0;i<words.length;i++)
      {
        for(int j=0;j<words.length;j++)
        {
            if(i!=j){
            if(words[i].contains(words[j])&&!a.contains(words[j])){
                a.add(words[j]);
            }}
        }
      }
        return a;
    }
}
