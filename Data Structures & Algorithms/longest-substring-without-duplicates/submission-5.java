class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 0 || length == 1) {
            return length;
        }
        int left = 0, max = 0;
        int[] freq = new int[128];
        for (int right = 0; right < length; right++) {
            char c = s.charAt(right);
            if (freq[c] == 1) {
                freq[c]++;
                while(freq[c]>1) {
                    freq[s.charAt(left)]--;
                    left++;
                }
            } else {
                freq[c]++;
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}
