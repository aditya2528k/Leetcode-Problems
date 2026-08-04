class Solution {
    public int subtractProductAndSum(int n) {
        int t= n;
        int prod = 1;
        int sum = 0;
        while(n > 0 ){
            int div = n % 10;
            prod *= div;
            n /= 10;
        }
        while(t > 0){
            int r = t % 10;
            sum += r;
            t /= 10;
        }
        return (prod - sum);
    }
}