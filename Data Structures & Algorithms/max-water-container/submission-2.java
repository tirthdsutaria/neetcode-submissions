class Solution {
    public int maxArea(int[] heights) {
        int l=0, r = heights.length-1, ans =0;
        while(l<r) {
            int min = Math.min(heights[l],heights[r]);
            int area = (r-l) * min;
            ans = area > ans ? area : ans;
            if(heights[l]<=heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
