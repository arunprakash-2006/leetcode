class Solution {
    public int clumsy(int n) {
        Stack<Integer> stack=new Stack<>();
        int index=0;
        int sum=0;
        stack.push(n);
        for(int i=n-1;i>=1;i--)
        {
            if(index==0)
            {
                int top=stack.pop();
                top=top*i;
                stack.push(top);
            }
            else if(index==1)
            {
                int top=stack.pop();
                top=top/i;
                stack.push(top);
            }

            else if(index==2)
                stack.push(i);
            
            else 
                stack.push(-i);
            index=(index+1)%4;
        }

        for(Integer i:stack)
        {
            sum=sum+i;
        }

        return sum;
    }
}