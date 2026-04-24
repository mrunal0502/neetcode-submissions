class Solution {
    public boolean isValid(String s) {
        int n = s.length();
         if(n%2==1) return false;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c=='(') stack.push(')'); 
            else if(c=='{') stack.push('}'); 
            else if(c=='[') stack.push(']'); 
            else if(!stack.isEmpty() && stack.peek()==c) stack.pop();
            else return false;
        }

        return stack.isEmpty();
    }
}
