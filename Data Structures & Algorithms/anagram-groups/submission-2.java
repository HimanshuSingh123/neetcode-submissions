class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> tracker = new HashMap<>();

        for(String str : strs){
            int[] letters = new int[26];

            for(Character c : str.toCharArray()){
                letters[c - 'a']++;
            }

            String lettersToConv = Arrays.toString(letters);
            if(!tracker.containsKey(lettersToConv)){
                tracker.put(lettersToConv, new ArrayList<>());
            }
            tracker.get(lettersToConv).add(str);
        }
        return new ArrayList<>(tracker.values());
    }
}
