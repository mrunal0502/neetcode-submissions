class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] letters = new int[26];

        for(char c : s.toCharArray()){
            letters[c-'a']++;
        }

        int odd = 0;

        for(int f : letters){
          if((f&1)==1) odd++;
          if(odd>1) return false;
        }

        return true;
    }
}
