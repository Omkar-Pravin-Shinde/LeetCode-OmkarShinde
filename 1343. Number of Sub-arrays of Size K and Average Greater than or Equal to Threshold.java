class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0 ;
        int count =0;
        int n = arr.length;
        for(int i= 0; i < k ; i++)
        {
            sum+= arr[i];
        }
        if (sum >= threshold * k) {
            count++;
        }
        int avg=0;
        int start = 0 ;
        int end = k;
        
        while(end < n)
        {
            sum -= arr[start];
            start++;
            sum+= arr[end];
            end++;

            avg = sum/k;
            if(avg >= threshold){
                count++;
            }
        }
        return count;
    }
}