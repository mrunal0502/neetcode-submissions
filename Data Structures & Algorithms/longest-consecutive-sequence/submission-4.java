class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        int maxCount = 0;
        for(int no : nums){
            set.add(no);
        }

        for(int no : set){
            if(!set.contains(no-1)){
                int currNo = no;
                 count = 1;

                while(set.contains(currNo+1)){
                    count++;
                    currNo++;
                }
            }
            
            maxCount = Math.max(count, maxCount);
        
        }

        return maxCount;
    }
}
