class Solution {
    public void moveZeroes(int[] a) {
        int e=0,i;
     for( i=0;i<a.length;i++){
         if(a[i]!=0){
             a[e++]=a[i];
         }
     }
         for(i=e;i<a.length;i++){
         a[i]=0;
     }
        
    }
}