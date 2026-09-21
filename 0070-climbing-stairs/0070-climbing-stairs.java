class Solution {
    HashMap<Integer, Integer> dp = new HashMap<>();
    public int climbStairs(int n) {
        int ans = fun(0, n);
        return ans;
    }
    int fun(int i, int n){
        if(i == n){
            return 1;
        }
        if(i > n){
            return 0;
        }
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        int a1 = fun(i + 1, n);
        int a2 = fun(i + 2, n);
        dp.put(i + 1, a1);
        dp.put(i + 2, a2);
        return a1 + a2;
    }
}