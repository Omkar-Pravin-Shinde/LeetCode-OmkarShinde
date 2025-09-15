class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length; 
        int sum = 0;
        
        for( int i = 0 ; i < k ; i++)
        {
            sum += nums[i];
        }

        int max = sum;
        int start=0, end=k;
    
        while(end < n)
        {
            sum -= nums[start];
            sum += nums[end];
            start++;
            end++;

            max = Math.max(max, sum);

        }
        return (double) max/k;
    }
}