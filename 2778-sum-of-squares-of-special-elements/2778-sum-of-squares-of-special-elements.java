class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for(int i = 1; i <= len; i++){
            int n = nums[i - 1];
            if(len % i == 0){
                sum += n * n;
            }
        }
        return sum;
    }
}