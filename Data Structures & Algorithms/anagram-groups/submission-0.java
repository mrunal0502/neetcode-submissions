class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String str : strs){
            char[] words = str.toCharArray();
            Arrays.sort(words);
            String word = new String(words);
            if(map.containsKey(word)){
                map.get(word).add(str);
            }
            else{
                ArrayList<String> inner = new ArrayList<>();
                inner.add(str);
                map.put(word, inner);
            }
        }

        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }

        return list;
    }
}
