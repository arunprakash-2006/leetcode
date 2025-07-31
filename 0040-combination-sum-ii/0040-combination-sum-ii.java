class Solution {
    List<Integer> temp= new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        back(0,candidates,temp,ans,target);
        return ans;
    }
    
     public void back(int ind,int[] arr, List<Integer> temp, List<List<Integer>> ans,int target)
     {
        if(target==0) 
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            temp.add(arr[i]);
            back(i+1,arr,temp,ans,target-arr[i]);
            temp.remove(temp.size()-1);

        }
     }


}