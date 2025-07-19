class Solution {
    public int fib(int n) {
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i < n ; i++){
            int temp = num1;
            num1 = num2;
            num2 = temp + num2;

        }
        return num1;
    }
}