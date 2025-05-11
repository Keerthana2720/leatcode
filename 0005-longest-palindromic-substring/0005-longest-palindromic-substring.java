class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i< s.length();i++){
            for(int j = i + 1; j <= s.length();j++){
                if(palindrome(s.substring(i,j))){
                     if(longest.length() < j-i){
                        longest= s.substring(i,j);

                }
            }
        }
    }
        return longest;

    }
    public boolean palindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}