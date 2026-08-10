class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;

        for(int i = 0; i < rows; i++){
            Arrays.sort(grid[i]);
        }
        int ans = 0;

        for(int j = col - 1; j >= 0; j--){
            int max  = 0;
            for(int i = 0; i < rows; i++){
                max = Math.max(max, grid[i][j]);
            }
            ans += max;
        }
        return ans;
    }
}