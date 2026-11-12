class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i =0;i<nums.length;i++) {
            int num = nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num && i!=j) {
                    return true;
                }
            }
        }
        return false;
    }
}