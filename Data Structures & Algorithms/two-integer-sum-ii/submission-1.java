class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;
        int sum = numbers[p1] + numbers[p2];

        while(sum != target){
            sum = numbers[p1] + numbers[p2];
            if(sum > target){
                p2 -= 1;
            } 

            if(sum < target){
                p1 += 1;
            }
        }

        return new int[] {p1 + 1, p2 + 1};
            
    }
}
