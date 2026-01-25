class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];

        for(int i = 0 ; i < nums1.length ; i++){
            int target = nums1[i];
            int temp1 = -1;
            for(int j = 0 ; j < nums2.length ; j++){
                if(target == nums2[j]){
                    temp1 = j;
                    break;
                }
            }
            int nextGreat = -1;
            for(int j = temp1 + 1 ; j < nums2.length ; j++){
                if(nums2[j] > target){
                    nextGreat = nums2[j];
                    break;
                }
            }
            ans[i] = nextGreat;
        }
        return ans;
    }
}