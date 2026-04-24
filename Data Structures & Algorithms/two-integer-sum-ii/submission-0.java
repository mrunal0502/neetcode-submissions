class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = numbers.length;
        for(int i=0; i<n; i++){
           map.put(numbers[i],i+1);
        }

        for(int i=0; i<n; i++){
            if(map.containsKey(target-numbers[i])){
                return new int[]{i+1,map.get(target-numbers[i])};
            }
        }

        return new int[]{-1,-1};
    }
}
