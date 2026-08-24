class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<n; i++){
        //    if(map.containsKey(target-numbers[i])){
        //        return new int[]{map.get(target-numbers[i]),i+1};
        //    }
          
        //      map.put(numbers[i],i+1);  
        // }

        int start = 0;
        int end = n-1;

        while(start<end){
            int sum = numbers[start] + numbers[end];

            if(sum==target) return new int[]{start+1, end+1};

            if(sum>target) end--;

            else start++;
        }

        return new int[]{-1,-1};
    }
}
