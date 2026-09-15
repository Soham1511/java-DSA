import java.util.*;

public class removeKDigits {
    public static void main(String[] args) {
        String s = "10200";
        int k = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            while (!stack.isEmpty() && digit < stack.peek() && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.peek());
            stack.pop();
        }
        if(sb.length() == 0){
            System.out.println('0');
        }
        int i = 0;

        while (i < sb.length() - 1 && sb.charAt(i) == '0') {
            i++;
        }

        System.out.println(sb.substring(i));
    }
}
