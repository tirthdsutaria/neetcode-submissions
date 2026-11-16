class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == 1) {
            return s.length();
        }
        int left = 0, maxLength = 0, maxFreq=0;
        int[] freq = new int[26];
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            freq[r - 'A']++;
            maxFreq = Math.max(maxFreq,freq[r-'A']);
            while((right-left+1)-maxFreq>k) {
                char l = s.charAt(left);
                freq[l-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
