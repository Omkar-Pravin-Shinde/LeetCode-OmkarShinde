class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        Arrays.fill(ans, -1);
        Stack <Integer> st = new Stack();                   

        for(int i = 0 ; i < nums.length * 2 ; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i % nums.length]){
                ans[st.pop()] = nums[i % nums.length];
            }
            if(i < nums.length) st.add(i);
            
        }
        return ans;
        
    }
}