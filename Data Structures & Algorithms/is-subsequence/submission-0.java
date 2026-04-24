class Solution {
    public boolean isSubsequence(String s, String t) {

        int n = t.length();
        int m = s.length();
        int i = 0;
        int j =0;

        while(i<n && j<m){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }

               i++;
        }

        if(j<m) return false;

        return true;

    }
}