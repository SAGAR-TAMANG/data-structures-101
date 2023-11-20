class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        for (int p1 = 0; p1 < heights.length; p1++) {
            for (int p2 = p1 + 1; p2 < heights.length; p2++) {
                int length = Math.min(heights[p1], heights[p2]);
                int width = p2 - p1;
                int area = length * width;

                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}