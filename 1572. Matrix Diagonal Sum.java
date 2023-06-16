class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0,k=0,g=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                    s = s + mat[i][j];
                else if((i+j)== (mat.length-1))
                    k = k + mat[i][j]; 
            }
        }
        g= s+k;
        return g;
    }
}