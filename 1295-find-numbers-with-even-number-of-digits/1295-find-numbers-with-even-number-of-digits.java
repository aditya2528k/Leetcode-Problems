class Solution {
    public int findNumbers(int[] nums) {
          int count = 0;

        for (int num : nums) {
            if (digits(num) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private int digits(int num) {

        int digitCount = 0;

        while (num > 0) {
            digitCount++;
            num /= 10;
        }

        return digitCount;
    }
}