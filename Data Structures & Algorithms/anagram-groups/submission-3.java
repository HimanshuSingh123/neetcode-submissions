class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> tracker = new HashMap<>();

        for(String str : strs){
            int[] chars = new int[26];

            for(Character c : str.toCharArray()){
                chars[c-'a']++;
            }

            String conved = Arrays.toString(chars);

            if(!tracker.containsKey(conved)){
                tracker.put(conved, new ArrayList<String>());
            }

            tracker.get(conved).add(str);

        }
        return new ArrayList(tracker.values());
    }
}
