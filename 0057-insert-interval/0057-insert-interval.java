class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int a = newInterval[0];
        int b = newInterval[1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (end < a) {
                res.add(new int[] { start, end });
            } else if (start > b) {
                res.add(new int[] { a, b });
                res.add(new int[] { start, end });

                for (int j = i + 1; j < intervals.length; j++) {
                    res.add(intervals[j]);
                }
                return res.toArray(new int[res.size()][]);
            } else {
                a = Math.min(a, start);
                b = Math.max(b, end);
            }
        }
        res.add(new int[] { a, b });
        return res.toArray(new int[res.size()][]);
    }
}