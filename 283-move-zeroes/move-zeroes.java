class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // int left = 0;
        // for(int i = 0 ; i < n ; i++){
        //     if(nums[i] != 0){
        //         int temp = nums[left];
        //         nums[left] = nums[i];
        //         nums[i] = temp;
        //         left++;
        //     }
        // }

        int left = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                nums[left] = nums[i];
                left++;
            }
        }
        while(left < n){
            nums[left] = 0;
            left++;
        }
        
    }
}