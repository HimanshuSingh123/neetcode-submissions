class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(tracker.containsKey(comp)){
                result[0] = tracker.get(comp);
                result[1] = i;
            } else {
                tracker.put(nums[i], i);
            }
        }
        return result;
    }
}
