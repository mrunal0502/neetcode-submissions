class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for( int no : nums){
            if(no==1){
                count++;
            }else{
              count=0;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}