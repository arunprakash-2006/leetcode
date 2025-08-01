class Solution {
    public List<List<Integer>> generate(int r) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            List<Integer> temp=new ArrayList<>();
            int num=1;
            for(int j=0;j<=i;j++)
            {
                temp.add(num);
                num=num*(i-j)/(j+1);
                
            }
            ans.add(new ArrayList<>(temp));

        }
        return ans;
        
    }
}