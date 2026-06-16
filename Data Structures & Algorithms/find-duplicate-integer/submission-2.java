class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
       //cycle detection
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while(fast!=slow);
        //finding duplicate
        slow = 0;
        while(fast!=slow){
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }
}
