import java.util.*;
class rpnEvaluation{
    public static void main(String[] args) {
        String arr[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            String token = arr[i];
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                if(token.equals("+")){
                    result = a + b;
                }
                else if(token.equals("-")){
                    result = a - b;
                }
                else if(token.equals("*")){
                    result = a * b;
                }
                else if(token.equals("/")){
                    result = a / b;
                }
                stack.push(result);
            }
            else{
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        System.out.println(stack.pop());
    }
}