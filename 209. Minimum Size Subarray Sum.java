class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int n = nums.length;
        int min = n+1;
        int st = 0;
        for(int end= 0 ; end < n ;end++)
        {
            sum += nums[end];
            while(sum >= target){
                min = Math.min(min, end - st + 1);
                sum -= nums[st];
                st++;
            }
        }
        return (min == n+1) ? 0 : min;
        
    }
}