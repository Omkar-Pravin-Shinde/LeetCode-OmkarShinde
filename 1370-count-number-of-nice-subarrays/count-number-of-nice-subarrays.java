class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // HashMap <Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        // int sum =0;
        // int count = 0;
        // for(int num : nums){
        //     sum += (num % 2);

        //     if(map.containsKey(sum - k)){
        //         count += map.get(sum - k);
        //     }
        //     map.put(sum, map.getOrDefault(sum, 0) + 1);

        // }
        // return count;
        return odd(nums, k) - odd(nums, k -1);
    }

    public int odd(int nums[], int k){
        int left = 0, odd = 0, subArray = 0;
        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] % 2 != 0){
                odd++;
            }
            while(odd > k){
                if(nums[left] % 2 != 0){
                    odd--;
                }
                left++;
            }
            subArray += right - left + 1;
        }
        return subArray;
    }


}