class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int ans = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int high = 0; high < s.length(); high++) {
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            int maxf = max(map);
            int len = high - low + 1;
            int diff = len - maxf;

            while (diff > k) {
                if(map.get(s.charAt(low)) == 1){
                  map.remove(s.charAt(low));
                }else{
                    map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
                }
                
                low++;
                maxf = max(map);
                len = high - low + 1;
                diff = len - maxf;
            }
            len = high - low + 1;
            ans = Math.max(ans, len);
        }
        return ans;
    }

    private int max(HashMap<Character, Integer> map) {
        int max = 0;
        for (int freq : map.values()) {
            max = Math.max(freq, max);
            
        }
        return max;
    }
}