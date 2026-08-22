class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int a = n;
        while(n > 0){
            int div = n % 10;
            sum+= div;
            prod *= div;
            n = n / 10;
        }
        int res = sum + prod;
        if(a % res == 0){
            return true;
        }
        return false;
    }
}