class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] res = new int[r][c];
        if(row == r && col == c){
            return mat;
        }
        if(row * col != r * c){
            return mat;
        }
        for(int i = 0; i < row * col; i++){
            int oldr = i / col;
            int oldc = i % col;

            int newr = i / c;
            int newc = i % c;

            res[newr][newc] = mat[oldr][oldc];
        }
        return res;
        
    }
}