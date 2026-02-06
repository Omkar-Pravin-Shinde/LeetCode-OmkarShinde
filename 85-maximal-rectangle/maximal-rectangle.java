class Solution {
    public int maximalRectangle(char[][] matrix) {
        int max =0;
        int col = matrix[0].length;
        int[] height = new int[col];

        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == '1'){
                    height[j] += 1;
                }else{
                    height[j] = 0;
                }

            }
            max = Math.max(max, largestRectangleArea(height));
        } 
        return max;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int max = 0;
        Deque <Integer> stack = new ArrayDeque<>();

        // Right Small
        for(int i = n-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        while(!stack.isEmpty()){
            stack.pop();
        }

        // Left Small
        for(int i = 0 ; i < n ; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        for(int i = 0 ; i < n ; i++){
            int curr = (right[i] - left[i] - 1) * heights[i];
            max = Math.max(curr, max);
        }
        return max;
    }

}