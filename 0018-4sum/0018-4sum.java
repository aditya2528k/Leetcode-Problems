class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int left = i + 1; left < n - 2; left++) {

                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    continue;
                }
                int mid = left + 1;
                int right = n - 1;

                while (mid < right) {
                    long sum = (long)nums[i] + nums[left] + nums[mid] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[mid], nums[right]));

                        mid++;
                        right--;

                        while (mid < right && nums[mid] == nums[mid - 1]) {
                            mid++;
                        }

                        while (mid < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        mid++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}