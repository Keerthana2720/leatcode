class Solution {
    public int totalFruit(int[] fruits) {
       int first=fruits[0],max=1,p=0,second=-1,left=0,right=1,n=fruits.length;
       while(right<n)
       {
        int cur=fruits[right];
        if(cur!=first)
        {
            if(second!=-1 && cur!=second)
            {
                max=Math.max(max,right-left);
                left=p;
            }

            second=first;
            first=cur;
            p=right;
        }
        right++;
       } 
       return Math.max(max,right-left);
    }
}