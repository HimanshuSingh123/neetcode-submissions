class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> tracker = new HashMap<String, List<String>>();

        for(String str : strs){
            
            int[] chars = new int[26];

            for(Character c : str.toCharArray()){
                chars[c - 'a']++;
            }

            String convertedArray = Arrays.toString(chars);

            if(!tracker.containsKey(convertedArray)){
                tracker.put(convertedArray, new ArrayList<>());
            }

            tracker.get(convertedArray).add(str);
        }

        return new ArrayList<>(tracker.values());
    }
}
