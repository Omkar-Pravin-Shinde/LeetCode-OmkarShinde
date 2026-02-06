class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int max = 0;
        Stack <Integer> stack = new Stack<>();

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

    // public int[] rightSum(int[] a){
    //     int rs[] = new int[a.length]; 
    //     Deque <Integer> stack = new ArrayDeque<>();

    //     for(int i = 0 ; i < a.length ; i++){
    //         while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
    //             stack.pop();
    //         }
    //         if(stack.isEmpty()){
    //             rs[i] = -1;
    //         }else{
    //             rs[i] = stack.peek();
    //         }
    //         stack.push(i);
    //     }
    //     return rs;
    // }

    // public int[] leftSum(int[] a){
    //     int rs[] = new int[a.length]; 
    //     Deque <Integer> stack = new ArrayDeque<>();

    //     for(int i = a.length-1 ; i >= 0 ; i--){
    //         while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
    //             stack.pop();
    //         }
    //         rs[i] = stack.isEmpty() ? a.length : stack.peek();
    //         stack.push(i);
    //     }
    //     return rs;

    // }
}