class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int low = 0;
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            m1.put(ch, m1.getOrDefault(ch, 0) + 1);
            while (high - low + 1 > p.length()) {
                if (m1.get(s.charAt(low)) == 1) {
                    m1.remove(s.charAt(low));
                } else {
                    m1.put(s.charAt(low), m1.get(s.charAt(low)) - 1);
                }
                low++;
            }
            if (m1.equals(map)) {
                ans.add(low);
            }
        }
        return ans;
    }
}