class Solution {
    public int titleToNumber(String t) {
        if(t.length()<=1){
            return t.charAt(0)-64;
        }
        else{
            int a=t.length();
            int sum=0;
            int j=a-1;
            for(int i=0;i<a;i++){
                if(i==a-1){
                    return sum+=(t.charAt(i)-64);
                }
               sum+=(t.charAt(i)-64)*Math.pow(26,j--);
            }
            System.out.println(sum);
        }
        return 0;
    }
}