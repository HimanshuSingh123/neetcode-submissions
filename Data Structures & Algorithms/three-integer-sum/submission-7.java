class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tracker = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            int p1 = i+1;
            int p2 = nums.length - 1;

            while(p1 < p2){
                int sum = nums[p1] + nums[p2] + nums[i];
                if(sum == 0){
                    tracker.add(List.of(nums[p1], nums[p2], nums[i]));
                    p1++;
                    p2--;

                    while(p1 < p2 && nums[p2+1] == nums[p2]){
                        p2--;
                    }
                    while(p1 < p2 && nums[p1-1] == nums[p1]){
                        p1++;
                    }
                }
                else if(sum > 0){
                    p2--;
                } else {
                    p1++;
                }
            }
        }

        return tracker;
    }
}
