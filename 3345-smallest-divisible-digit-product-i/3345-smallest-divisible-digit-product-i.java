class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; ; i++){
            int res = 1;
            int x = i;
            while(x > 0){
                res *= (x % 10);
                x /= 10;
            }
            if(res % t == 0){
                return i;
            }
        }
    }
}