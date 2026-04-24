class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        int n = s.length();
        int i = n-1;
        int count =0;

        while(i>=0){
          if(s.charAt(i)==' '){
            return count;
          }
          i--;
          count++;
        }

        return count;
    }
}