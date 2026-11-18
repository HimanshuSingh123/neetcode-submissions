class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> t = new HashMap<>();

        for(String s : strs){
            int[] nums = new int[26];

            for(char c : s.toCharArray()){
                nums[c-'a']++;
            }

            String result = Arrays.toString(nums);

            if(!t.containsKey(result)){
                t.put(result, new ArrayList<String>());
            }
            t.get(result).add(s);

        }

        return new ArrayList<>(t.values());
    }
}
