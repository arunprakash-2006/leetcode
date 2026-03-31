class Solution {
    public int[][] generateMatrix(int n) {
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int number=1;
        int res[][]=new int[n][n];
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                res[top][i]=number++;
            }
            top++;

        if(left<=right)
        {
            for(int i=top;i<=bottom;i++)
            {
                res[i][right]=number++;
            }
            right--;
        }

        if(top<=bottom)
        {
            for(int i=right;i>=left;i--)
            {
                res[bottom][i]=number++;
            }
            bottom--;
        }
        if(left<=right)
        {
            for(int i=bottom;i>=top;i--)
            {
                res[i][left]=number++;
            }
            left++;
        }

        }

        return res;
        
    }
}