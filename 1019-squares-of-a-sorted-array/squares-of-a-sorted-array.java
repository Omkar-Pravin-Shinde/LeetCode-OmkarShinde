class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i = 0 ; i < nums.length; i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        
        int n = nums.length;
        int res[] = new int[n];
        int right = n - 1;
        int left = 0;
        int index = n - 1;

        while(left <= right){
            int rightsq = nums[right] * nums[right];
            int leftsq = nums[left] * nums[left];

            if(rightsq < leftsq){
                res[index] = leftsq;
                left++;
            }else{
                res[index] = rightsq;
                right--;
            }
            index--;
        }
        return res;
    }
}