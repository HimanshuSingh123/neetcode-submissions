class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int realSum = 0;
        while(p1 < p2){
            int heightMax = Math.min(heights[p1], heights[p2]);
            int sum = (p2 - p1) * heightMax;

            if(sum > realSum){
                realSum = sum;
            }
            if(heights[p1] > heights[p2]){
                p2--;
            } else {
                p1++;
            }
        }
        return realSum;
    }
}
