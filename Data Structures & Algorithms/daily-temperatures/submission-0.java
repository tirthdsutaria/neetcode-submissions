class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ret = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++) {
            int count = 1;
            for(int j=i+1;j<temperatures.length;j++) {
                if(temperatures[j]>temperatures[i]) {
                    ret[i]=count;
                    break;
                } else {
                    count++;
                }
            }
        }
        return ret;
    }
}
