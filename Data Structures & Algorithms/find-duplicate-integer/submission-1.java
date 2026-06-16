class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int no : nums){
            if(set.contains(no)) return no;
            set.add(no);
        }

        return -1;
    }
}
