class MinStack {
    Node top;
    class Node
    {
        int data,min;
        Node next;
        Node(int data,int min)
        {
            this.data=data;
            this.next=null;
            this.min=min;
        }

    }

    

   

    public MinStack() {
       top=null;
    }
    
    public void push(int data) 
    {
        
        if(top==null)
        {
            Node newnode=new Node(data,data);
            top=newnode;
            return;
        }
            int currentMin = Math.min(data, top.min);
            Node newnode = new Node(data, currentMin);
            newnode.next=top;
            top=newnode;
    }
        
    
    
    public void pop() {
        if(top!=null)
        top=top.next;
        
    }
    
    public int top() {
        return top.data;
        
    }
    
    public int getMin() {
        return top.min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */