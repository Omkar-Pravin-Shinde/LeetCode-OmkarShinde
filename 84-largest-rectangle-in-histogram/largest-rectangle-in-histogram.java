class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int left[] = rightSum(heights);
        int right[] = leftSum(heights);

        for(int i = 0 ; i < heights.length ; i++){
            int curr = (right[i] - left[i] - 1) * heights[i];
            max = Math.max(curr, max);
        }
        return max;
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