class Solution {
    public void rotate(int[][] matrix) {
        int size=matrix.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                swap(matrix,i,j);
            }
        }

        for(int i=0;i<size;i++)
        {
            reverse(matrix[i]);
        }
    }

    void reverse(int [] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    void swap(int[][] matrix,int ind1,int ind2)
    {
        int temp=matrix[ind1][ind2];
        matrix[ind1][ind2]=matrix[ind2][ind1];
        matrix[ind2][ind1]=temp;
    }
}