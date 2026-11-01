class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int p1 = 0;
        int p2 = heights.length - 1;

        while(p1 < p2){
            int maxAreaCalc = (p2 - p1) * (Math.min(heights[p1], heights[p2]));
            if(maxAreaCalc > maxArea){
                maxArea = maxAreaCalc;
            }
            if(heights[p1] < heights[p2]){
                p1++;
            } else {
                p2--;
            }

        }

        System.out.println(maxArea);
        return maxArea;
    }
}
