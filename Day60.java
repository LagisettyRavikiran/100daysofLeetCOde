class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int top = 0;
        int bottom  = n-1;
        while(top<bottom){
        for(int i=0;i<n;i++){
            int temp = matrix[top][i];
            matrix[top][i] = matrix[bottom][i];
            matrix[bottom][i] = temp;
        }
            top+=1;
            bottom-=1;
        }
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                int temp = matrix[j][k];
                matrix[j][k] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
    }
}