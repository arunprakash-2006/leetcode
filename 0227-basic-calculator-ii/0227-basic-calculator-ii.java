class Solution {
    public static int OpPrece(char op) {
        switch(op) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

    public static int res(int a, int b, char c) {
        switch(c) {
            case '^':
                return (int)Math.pow(b, a); 
            case '*':
                return a * b;
            case '/':
                return b / a; 
            case '+':
                return a + b;
            case '-':
                return b - a;
        }
        return 0;
    }

    public int calculate(String s) {
        Stack<Integer> valstack=new Stack<>();
        Stack<Character> ostack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c== ' ')
            {
                continue;
            }
            else if(Character.isDigit(c))
            {
                valstack.push(c - '0');
            }

            else
            {
                while(!ostack.isEmpty() && OpPrece(c)<=OpPrece(ostack.peek()))
                {
                    int a=valstack.pop();
                    int b=valstack.pop();
                    char op=ostack.pop();
                    valstack.push(res(a,b,op));
                }
                ostack.push(c);
            }
        }

        while(!ostack.isEmpty())
        {
            int a=valstack.pop();
            int b=valstack.pop();
            char op=ostack.pop();
            valstack.push(res(a,b,op));
        }


        return valstack.peek();

    }
}