class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> tracker = new HashMap<String, List<String>>();
        for(String str : strs){
            int[] character = new int[26];
            for(Character c : str.toCharArray()){
                character[c - 'a']++;
            }
            String charConv = Arrays.toString(character);
            if(!tracker.containsKey(charConv)){
                //List<String> newList = new List<String>();
                tracker.put(charConv, new ArrayList<String>());
            }
            tracker.get(charConv).add(str);
        }
        return new ArrayList(tracker.values());
    }
}
