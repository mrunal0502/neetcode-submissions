class NumMatrix {
    int [][] prefixSum;
    public NumMatrix(int[][] matrix) {
        //this.matrix=matrix;
        int n = matrix.length;
        int m = matrix[0].length;
        prefixSum = new int[n][m];

        for(int row=0; row<n; row++){
            prefixSum[row][0] = matrix[row][0];
            for(int col=1; col<m; col++){
               prefixSum[row][col]=prefixSum[row][col-1] + matrix[row][col];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
       
       for(int row = row1; row<=row2; row++){
         if(col1>0){
            res+= prefixSum[row][col2] - prefixSum[row][col1-1];
         }else{
            res+= prefixSum[row][col2];
         }
       }

       return res;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */