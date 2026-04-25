class MinStack {
   class Pair{
    int val;
    int min;
    
    Pair(int val, int min){
        this.val = val;
        this.min = min;
    }

   

   }

   Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new Pair(val,val));
        }else{
            int prevMin = stack.peek().min;
            int currMin = (prevMin>val)?val:prevMin;
            stack.push(new Pair(val,currMin));
        }
    }
    
    public void pop() {
       stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}
