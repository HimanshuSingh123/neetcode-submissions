class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int maxArea = 0;

        while(p1 < p2){
            int currMaxArea = (p2 - p1) * (Math.min(heights[p1], heights[p2]));
            if(currMaxArea > maxArea){
                maxArea = currMaxArea;
            }
            if(heights[p1] < heights[p2]){
                p1++;
            } else {
                p2--;
            }
        }

        return maxArea;
    }
}
