import java.util.*;
class longestValidParenthesis{
    public static void main(String[] args) {
        String s = "(()";
        Stack<Integer> stack = new Stack<>();
        int length = Integer.MIN_VALUE;
        stack.push(-1);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                }
                else{
                    length = Math.max(length, i - stack.peek());
                }
            }
        }
        System.out.println(length);
    }
}