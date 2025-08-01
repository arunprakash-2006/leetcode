class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        List<Integer> temp=new ArrayList<>();
        int left=0,right=0;
        while(left<m && right<n)
        {
            if(num1[left]<num2[right])
            {
                temp.add(num1[left]);
                left++;
            }
            else 
            {
                temp.add(num2[right]);
                right++;
            }

        }
        while(left<m)
        {
            temp.add(num1[left]);
            left++;
        }
        while(right<n)
        {
            temp.add(num2[right]);
            right++;
        }
        
        for(int k=0;k<temp.size();k++)
        {
            num1[k]=temp.get(k);
        }
    }
}