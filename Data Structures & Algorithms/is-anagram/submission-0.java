class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> tracker = new HashMap<>();

        for(int i  = 0; i < s.length(); i++){
            char c = s.charAt(i);
            tracker.put(c, tracker.getOrDefault(c, 0) + 1);
        }

        for(int i  = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!tracker.containsKey(c)){
                return false;
            }
            tracker.put(c, tracker.get(c) - 1);
        }

        for(int value : tracker.values()){
            if(value != 0){
                return false;
            }
        }

        return true;
    }
}
