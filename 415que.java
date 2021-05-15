class Solution {
    public String addStrings(String num1, String num2) {
       int p1=num1.length()-1;
        int p2=num2.length()-1;
        int carry=0,num=0;
        StringBuilder sum=new StringBuilder();
        while(p1>=0||p2>=0)
        {
            if(p1>=0&&num1.charAt(p1)>=0){
    num=num+carry+(num1.charAt(p1)-'0');
            carry=0;
               
            }
            if(p2>=0&&num2.charAt(p2)>=0){
    num=num+carry+(num2.charAt(p2)-'0');
        
            }
            sum.append(num%10);
            carry=num/10;
            num=0;
           p1--;
            p2--;
        }
        if(carry!=0)sum.append(carry);
        return sum.reverse().toString();
        
    }
}
