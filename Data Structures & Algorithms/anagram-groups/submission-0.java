class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            List<String> values = map.getOrDefault(key, new ArrayList());
            values.add(strs[i]);
            map.put(key, values);
        }
        return new ArrayList<>(map.values());
    }
}
