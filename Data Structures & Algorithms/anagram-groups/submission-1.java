class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> tracker = new HashMap<>();
        for(String str : strs){
            int[] chars = new int[26];
            for(Character c : str.toCharArray()){
                chars[c - 'a']++;
            }
            String convKey = Arrays.toString(chars);
            if(!tracker.containsKey(convKey)){
                tracker.put(convKey, new ArrayList<String>());
            }
            tracker.get(convKey).add(str);
        }
        return new ArrayList<>(tracker.values());
    }
}
