import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String s : tokens) {
        if ("+".equals(s)) stack.push(stack.pop() + stack.pop());
        else if ("-".equals(s)) stack.push(-stack.pop() + stack.pop());
        else if ("/".equals(s)) stack.push((int)(1D / stack.pop() * stack.pop()));
        else if ("*".equals(s)) stack.push(stack.pop() * stack.pop());
        else stack.push(Integer.valueOf(s));
    }

    return stack.pop();
}
}

/*
 * This approach is using Stack data structure which works on LIFO (Last In First Out) Principle. 
*/