class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast != 1){
            slow = square(slow);
            fast = square(square(fast));
            if(slow == fast && slow != 1){
                return false;
            }
        } 
        return true;
    }

    private int square(int m){
        int sum = 0;
        while(m > 0){
            int div = m % 10;
            m = m / 10;
            sum = sum + div*div;
        }
        return sum;
    }
}