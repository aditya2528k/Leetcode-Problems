class Solution {
    public int countDigits(int num) {
        int count = 0;
        int actual = num;
        while(num>0){
            int rev = num%10;
            if(actual%rev == 0){
                count++;
            }
          num /= 10;
        }
        return count;
    }
}