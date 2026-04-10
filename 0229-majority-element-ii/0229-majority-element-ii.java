class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int length=nums.length;
        int cand1=0;
        int vote1=0;
        int cand2=0;
        int vote2=0;
        int more=length/3;
        for(int i:nums)
        {
            if(i==cand1) vote1++;
            else if(i==cand2) vote2++;
            else if(vote1==0)
            {
                cand1=i;
                vote1=1;
            }
            else if(vote2==0) 
            {
                cand2=i;
                vote2=1;
            }
            else 
            {
                vote1--;
                vote2--;

            }
        }
        //System.out.print(cand1+" "+cand2);
        vote1=0;
        vote2=0;
        for(int i:nums)
        {
            if(i==cand1) vote1++;
            else if(i==cand2) vote2++;
        }
        if(vote1>more) res.add(cand1);
        if(vote2>more) res.add(cand2);

        return res;


        
    }
}