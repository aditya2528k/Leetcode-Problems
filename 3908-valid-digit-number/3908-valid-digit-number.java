class Solution {
    public boolean validDigit(int n, int x) {
     boolean valid = false;
     while(n > 9){
        if(n % 10 == x){
            valid = true;
        }
        n/=10;
     }
     return valid && (n != x);
    }
}