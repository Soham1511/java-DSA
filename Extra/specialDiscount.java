import java.util.Arrays;
import java.util.Stack;

class specialDiscount{
    public static void main(String[] args) {
        int a[] = {10,1,1,6};
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[a.length];
        for(int i = 0; i<a.length; i++){
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
                res[stack.peek()] = a[stack.peek()] - a[i];
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res[stack.peek()] = a[stack.peek()];
            stack.pop();
        }
        System.out.println(Arrays.toString(res));
    }
}