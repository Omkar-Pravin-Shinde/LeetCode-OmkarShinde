import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxlen =0; 
        int start = 0;
        for(int end =0; end < n; end++)
        {
            char c = s.charAt(end);

            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}