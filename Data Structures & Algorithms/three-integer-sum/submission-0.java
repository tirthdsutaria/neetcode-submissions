class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet();
        for(int i=0;i<nums.length;i++) {
            int j=i+1, k=nums.length-1;
            while(j<k) {
                int threeSum = nums[i] +nums[j]+nums[k];
                if(threeSum>0) {
                    k--;
                } else if(threeSum<0) {
                    j++;
                } else {
                    ans.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
