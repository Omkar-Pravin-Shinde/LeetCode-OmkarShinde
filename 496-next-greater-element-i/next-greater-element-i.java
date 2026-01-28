class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int ans[] = new int[nums1.length];

        // for(int i = 0 ; i < nums1.length ; i++){
        //     int target = nums1[i];
        //     int temp1 = -1;
        //     for(int j = 0 ; j < nums2.length ; j++){
        //         if(target == nums2[j]){
        //             temp1 = j;
        //             break;
        //         }
        //     }
        //     int nextGreat = -1;
        //     for(int j = temp1 + 1 ; j < nums2.length ; j++){
        //         if(nums2[j] > target){
        //             nextGreat = nums2[j];
        //             break;
        //         }
        //     }
        //     ans[i] = nextGreat;
        // }
        // return ans;

        int ans[] = new int[nums1.length];
        HashMap <Integer, Integer> map = new HashMap<>();   // to store next great element for curr
        Stack <Integer> st = new Stack();                   // to pop and push reuqired
        for(int i = 0 ; i < nums2.length ; i++){
            while(!st.isEmpty() && st.peek() < nums2[i]){   // if stack empty or top elem of stack is smaller 
                map.put(st.pop(), nums2[i]);                //pop that and put it in map
            }
            st.push(nums2[i]);                              // push same elemnt 
        }
        for(int i : st){    
            map.put(i , -1);                                // make other to -1
        }
        for(int i = 0 ; i < nums1.length ; i++){
            ans[i] = map.get(nums1[i]);                     // assign all ele and there next great
        }
        return ans;
    }
}