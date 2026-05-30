class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    public void push(int x) {
       if(st2.isEmpty()){
          st2.push(x);
       }else{
          while(!st2.isEmpty()){
            int temp=st2.pop();
            st1.push(temp);
          }
          st1.push(x);
       }
       while(!st1.isEmpty()){
        st2.push(st1.pop());
       }
    }
    public int pop() {
        int temp=st2.pop();
        return temp;
    }
    public int peek() {
        return st2.peek();
    }
    public boolean empty() {
        return st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */