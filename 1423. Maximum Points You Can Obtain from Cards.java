class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int Lsum= 0;
        int n = cardPoints.length;
        for(int i =0; i< k;i++)
        {
            Lsum+= cardPoints[i];
        }
        int max=Lsum;
        int Rsum=0;
        for(int i = 0; i< k ;i++)
        {
            Lsum -= cardPoints[k - 1 - i];
            Rsum += cardPoints[n - 1 - i];
            max = Math.max(max, Lsum + Rsum);
        }
        return max;
    }
}