class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public int[] rightSum(int[] a){
        int rs[] = new int[a.length]; 
        Stack <Integer> stack = new Stack<>();

        for(int i = 0 ; i < a.length ; i++){
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                rs[i] = -1;
            }else{
                rs[i] = stack.peek();
            }
            stack.push(i);
        }
        return rs;
    }

    public int[] leftSum(int[] a){
        int rs[] = new int[a.length]; 
        Stack <Integer> stack = new Stack<>();

        for(int i = a.length-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
                stack.pop();
            }
            rs[i] = stack.isEmpty() ? a.length : stack.peek();
            stack.push(i);
        }
        return rs;

    }
}