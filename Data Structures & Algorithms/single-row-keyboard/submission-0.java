class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<26; i++){
            map.put(keyboard.charAt(i),i);
        }
       
       int initial = 0;
       int ans =0;

        for(char c : word.toCharArray()){
            ans = ans + Math.abs(initial - map.get(c));
            initial = map.get(c);
        }

        return ans;
    }
}
