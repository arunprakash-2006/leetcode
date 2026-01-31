class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String ch:tokens)
        {
            if (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/"))
            {
                
                int num=Integer.parseInt(ch);
                stack.push(num);
            }

            else
            {
                if(ch.equals("+"))
                {
                    int top1=stack.pop();
                    int top2=stack.pop();
                    stack.push(top1+top2);
                }
                else if(ch.equals("-"))
                {
                    int top1=stack.pop();
                    int top2=stack.pop();
                    stack.push(top2-top1);
                }
                else if(ch.equals("*"))
                {
                    int top1=stack.pop();
                    int top2=stack.pop();
                    stack.push(top1*top2);
                }
                else
                {
                    int top1=stack.pop();
                    int top2=stack.pop();
                    stack.push(top2/top1);
                }
            }
            
        }

        return stack.pop();
 
    }
}