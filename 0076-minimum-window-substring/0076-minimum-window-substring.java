class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (char c : t.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        int low = 0;
        int a = 0;
        int b = m1.size();
        int min = Integer.MAX_VALUE;
        int start = 0;
        HashMap<Character, Integer> m2 = new HashMap<>();
        for (int high = 0; high < s.length(); high++) {
            char c = s.charAt(high);
            m2.put(c, m2.getOrDefault(c, 0) + 1);
            if (m1.containsKey(c) &&
                m2.get(c).intValue() == m1.get(c).intValue()) {
                a++;
            }
            while (a == b) {
                int len = high - low + 1;
                if (len < min) {
                    min = len;
                    start = low;
                }
                char leftChar = s.charAt(low);
                m2.put(leftChar, m2.get(leftChar) - 1);
                if (m1.containsKey(leftChar) &&
                    m2.get(leftChar) < m1.get(leftChar)) {
                    a--;
                }
                low++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + min);
    }
}