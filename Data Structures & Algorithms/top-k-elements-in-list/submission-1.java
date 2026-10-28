class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        for(Integer num : nums){
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(Integer key : tracker.keySet()){
            Integer val = tracker.get(key);
            if(buckets[val] == null){
                buckets[val] = new ArrayList<>();
            }
            buckets[val].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for(int i = buckets.length - 1; i > 0; i--){
            if(buckets[i] != null){
                for(Integer num : buckets[i]){
                    result[index] = num;
                    index++;
                    if(index == k){
                        return result;
                    }
                    
                }
            }
        }
        return result;
    }
}
