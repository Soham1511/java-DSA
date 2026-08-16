class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i<=heights.length; i++){
            int currentHeight = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] >= currentHeight){
                int popped = stack.pop();
                int ht = heights[popped];
                int rb = i;
                int lf = stack.isEmpty() ? -1 : stack.peek();
                int width = rb - lf - 1;
                maxArea = Math.max(maxArea, ht * width);
            }
            if (i < heights.length) {
                stack.push(i);
            }
        }
        return maxArea;
    }
}