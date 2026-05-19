class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
                sum += newScore;
            }else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
                sum += stack.peek();
            }else if(operations[i].equals("C")){
                int x=stack.pop();
                sum -= x;
            }else{
                stack.push(Integer.parseInt(operations[i]));
                sum += stack.peek();
            }
        }
        return sum;
    }
}