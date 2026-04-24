class Solution {
    public int[] sortArray(int[] nums) {
        //bubble 
        int n = nums.length;
        boolean isSorted = true;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                    isSorted = false;
                }
            }

            if(isSorted) break;
        }

        return nums;
    }
}