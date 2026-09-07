import java.util.*;
public class basicCalculator {
    public static int precedence(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        return 0;
    }
    public static void calculate(Stack<Integer> oprands, Stack<Character> operators){
        char operator = operators.pop();
        int b = oprands.pop();
        int a = oprands.pop();
        int result = 0;
        if(operator == '+'){
            result = a + b;
        }
        else if(operator == '-'){
            result = a - b;
        }
        else if(operator == '*'){
            result = a * b;
        }
        else if(operator == '/'){
            result = a/b;
        }
        oprands.push(result);
    }
    public static void main(String[] args) {
        String s = "3+2*2";
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int number = 0;
                while (i<s.length() && Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                operand.push(number);
                i--;
            }
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (!operator.isEmpty() && precedence(operator.peek()) >= precedence(ch)) {
                    calculate(operand, operator);
                }
                operator.push(ch);
            }
        }
        while(!operator.isEmpty()){
            calculate(operand, operator);
        }
        System.out.println(operand.pop());
    }
}
