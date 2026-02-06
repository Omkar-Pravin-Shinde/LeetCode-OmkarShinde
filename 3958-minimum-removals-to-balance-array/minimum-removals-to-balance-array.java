class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0 , right = 0 ;
        int ans = n + 1;
        while(right < n){
            while(right < n && nums[right] <= (long) k * nums[left]){
                right++;
            }
            ans = Math.min(ans, n - (right - left));
            left++;
        }
        return ans;

    }
}