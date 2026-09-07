import java.util.*;
class longestValidParenthesis{
    public static void main(String[] args) {
        String s = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        System.out.println(s.length() - stack.size());
    }
}