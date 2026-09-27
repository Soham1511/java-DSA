import java.util.*;
public class parenthesisReverseSubstring {
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
                for(int j = 0; j<sb.length(); j++){
                    stack.push(sb.charAt(j));
                }
                sb.setLength(0);
            }
            else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
