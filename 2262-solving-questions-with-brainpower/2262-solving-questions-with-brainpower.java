class Solution {
    public long mostPoints(int[][] questions) {
        long [] mp = new long[questions.length];
        for(int i = questions.length -1; i>= 0; i--){
            int index = i + questions[i][1] + 1;
            if(index < questions.length) {
                mp[i] = mp[index] + questions[i][0];
            }
            else{
                mp [i] = questions[i][0];
            }
            if(i < questions.length -1){
                mp [i] = Math.max(mp[i+1],mp[i]);
            }
        }
        return mp[0];
    }
}