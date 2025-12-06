class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
       int time =0;
       for(int i=0;i<left.length;i++){
               time = Math.max(time,left[i]);
           }
        for(int j=0;j<right.length;j++){
                time = Math.max(time,n-right[j]);
            }
    return time;
        }
       }
