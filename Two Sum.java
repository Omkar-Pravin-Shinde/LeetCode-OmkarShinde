class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int n = nums.length;
        //int temp[] = new int[n];
        
        for(int i= 0; i < n; i++)
        {
            for (int j = i+1; j < n;j++)
            {
                
                if(nums[i]+ nums[j] == target)
                {
                    return new int[] {i,j};
                }
            }
            
        }
        return new int[] {-1, -1};
    }
}