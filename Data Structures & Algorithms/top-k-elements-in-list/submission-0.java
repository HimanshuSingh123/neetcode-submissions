class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();

        for(int num : nums){
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }

        //int[] list = new int[nums.length() + 1];
        List<Integer>[] frequency = new List[nums.length + 1];

        for(int num : tracker.keySet()){
            int count = tracker.get(num);

            if(frequency[count] == null){
                frequency[count] = new ArrayList<>();
            }

            frequency[count].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = frequency.length - 1; i > 0; i--){
            if(frequency[i] != null){
                for(int j : frequency[i]){
                    result[index] = j;
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
