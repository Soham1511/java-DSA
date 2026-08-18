import java.util.Stack;

public class largestRectangle {
    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int popped = stack.pop();
                int ht = heights[popped];
                int rb = i;
                int lf;
                if (stack.isEmpty()) {
                    lf = -1;
                } else {
                    lf = stack.peek();
                }
                int width = rb - lf - 1;
                maxArea = Math.max(maxArea, ht * width);
            }
            stack.push(i);
        }
        System.out.println(maxArea);
    }
}
