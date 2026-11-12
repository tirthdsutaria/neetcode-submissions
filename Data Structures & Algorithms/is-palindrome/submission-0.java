class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] arr=cleanString.toLowerCase().toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
