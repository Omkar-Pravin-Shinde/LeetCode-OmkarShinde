class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count =0;
        for(int i =0 ; i < k; i++)
        {
            if(isVowel(s.charAt(i))) count++;
            
        }
        int max = count;
        for(int last = k; last < n; last++)
        {
            if(isVowel(s.charAt(last - k))) count--;
            if(isVowel(s.charAt(last))) count++;

            max = Math.max(max, count);

            if(max == k) return k;
        }
        return max;

    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}