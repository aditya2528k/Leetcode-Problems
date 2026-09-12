class Solution {
    public int maximumSum(int[] arr) {
        int nodel = arr[0];
        int del = Integer.MIN_VALUE;
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++){
            int prev = nodel;
            int prev1 = del;
            nodel = Math.max(nodel + arr[i], arr[i]);

            if(del == Integer.MIN_VALUE){
                del = arr[i];
            }else{
                del = prev1 + arr[i];
            }
            del = Math.max(del, prev);
            ans = Math.max(ans, Math.max(nodel, del));
        }
           return ans;
    } 
}