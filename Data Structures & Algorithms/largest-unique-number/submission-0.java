class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int no : nums){
            map.put(no, map.getOrDefault(no,0)+1);
        }


        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }
}
