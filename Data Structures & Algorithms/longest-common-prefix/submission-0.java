class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (strs == null || strs.length == 0) return "";
        String pref = strs[0];

        for(int i=1; i<n; i++){
            while(!strs[i].startsWith(pref)){
                pref = pref.substring(0,pref.length()-1);

                if (pref.isEmpty()) return "";
            }
        }
        
        return pref;
    }
}