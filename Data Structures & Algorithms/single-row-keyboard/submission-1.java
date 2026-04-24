class Solution {
    public int calculateTime(String keyboard, String word) {
    //     HashMap<Character, Integer> map = new HashMap<>();

    //     for(int i=0; i<26; i++){
    //         map.put(keyboard.charAt(i),i);
    //     }

    int [] letters  = new int[26];

      for(int i=0; i<26; i++){
        char c = keyboard.charAt(i);
        letters[c-'a'] = i;
      }
       
       int initial = 0;
       int ans =0;

        for(char c : word.toCharArray()){
            ans = ans + Math.abs(initial - letters[c-'a']);
            initial = letters[c-'a'];
        }

        return ans;
      

    }
}
