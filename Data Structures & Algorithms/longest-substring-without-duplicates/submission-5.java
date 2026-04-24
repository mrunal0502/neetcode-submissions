class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s==null) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int right =0;
        int left = 0;
        int maxL =0;
        while(right<n){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }

            maxL = Math.max(maxL, right-left+1);
            map.put(s.charAt(right),right);
            right++;
        }

        return maxL;
    }
}
