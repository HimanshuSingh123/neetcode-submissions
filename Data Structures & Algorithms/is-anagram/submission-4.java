class Solution {
    public boolean isAnagram(String s, String t) {
        int[] track = new int[26];

        for(char sChar : s.toCharArray()){
            if(!Character.isLetterOrDigit(sChar)){
                continue;
            }
            track[sChar - 'a']++;
        }

        for(char tChar : t.toCharArray()){
            if(!Character.isLetterOrDigit(tChar)){
                continue;
            }
            track[tChar - 'a']--;
        }

        for(Integer i : track){
            if(i != 0){
                return false;
            }
        }

        return true;

    }
}
