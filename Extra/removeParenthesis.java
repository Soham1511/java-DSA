import java.util.*;
public class removeParenthesis {
    public static void main(String[] args) {
        String s = "))((";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            sb.insert(0, s.charAt(i));
            if(!stack.isEmpty() && s.charAt(stack.peek()) == '(' && s.charAt(i) == ')'){
                stack.pop();
            }
            else if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                stack.push(i);
            }
        }
        sb.reverse();
        while(!stack.isEmpty()){
            sb.deleteCharAt(stack.peek());
            stack.pop();
        }
        System.out.println(sb);
    }
}
