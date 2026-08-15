class Solution {
    public int clumsy(int n) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(n);

        int index = 0;

        for (int i = n - 1; i >= 1; i--) {
            if (index == 0) { 
                stack.push(stack.pop() * i);
            } else if (index == 1) {
                stack.push(stack.pop() / i);
            } else if (index == 2) {
                stack.push(i);
            } else { 
                stack.push(-i);
            }
            index = (index + 1) % 4;
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
