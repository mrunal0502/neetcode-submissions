class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int no : nums){
            if(count==0){
                candidate = no;
            }

            count+=(no==candidate)? 1 : -1;
        }

        return candidate;
    }
}