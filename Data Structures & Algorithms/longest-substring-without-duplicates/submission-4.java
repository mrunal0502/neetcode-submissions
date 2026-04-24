class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s==null) return 0;
        HashSet<Character> set = new HashSet<>();
        int maxL = 1;
        int left = 0;
        int right = 0;
        int n = s.length();
        while(right<n){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxL = Math.max(maxL, set.size());
            right++;
        }

        return maxL;
    }
}
