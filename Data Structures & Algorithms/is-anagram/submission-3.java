class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> tracker = new HashMap<>();

        for(Character c : s.toCharArray()){
            tracker.put(c, tracker.getOrDefault(c, 0) + 1);
        }

        for(Character c : t.toCharArray()){
            if(!tracker.containsKey(c)){
                return false;
            }
            tracker.put(c, tracker.get(c) - 1);
        }

        for(Character c : tracker.keySet()){
            int num = tracker.get(c);
            if(num != 0){
                return false;
            }
        }

        return true;
    }
}
