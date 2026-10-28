class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> tracker = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            tracker.put(c, tracker.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!tracker.containsKey(c)){
                return false;
            }
            tracker.put(c, tracker.get(c) - 1);
        }

        for(char c : tracker.keySet()){
            if(tracker.get(c) != 0){
                return false;
            }
        }

        return true;
    }
}
