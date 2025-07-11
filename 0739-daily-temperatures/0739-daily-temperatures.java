class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int ans[]=new int[size];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<size;i++)
        {
            while(!s1.isEmpty() && temperatures[i]> temperatures[s1.peek()])
            {
                int prev=s1.pop();
                ans[prev]=i-prev;
            }
            s1.push(i);
        }
        return ans;
        
    }
}