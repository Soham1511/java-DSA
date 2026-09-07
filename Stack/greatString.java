import java.util.Stack;

class greatString{
    public static void main(String[] args) {
        String s = "leEeetcode";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(!stack.isEmpty() && Character.isUpperCase(s.charAt(i))){
                char lower = Character.toLowerCase(s.charAt(i));
                if(stack.peek() == lower){
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.peek());
            stack.pop();
        }
        System.out.println(sb.toString());
    }
}