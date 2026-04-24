class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int area = 0;
        int left = 0;
        int right = heights.length-1;

        while(left<right){
            area = (right-left)*Math.min(heights[left], heights[right]);
            res = Math.max(area,res);
            if(heights[left]<heights[right]) left++;
            else right--;
        }

        return res;
    }
}
