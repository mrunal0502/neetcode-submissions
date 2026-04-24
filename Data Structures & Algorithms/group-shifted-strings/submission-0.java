class Solution {
    public List<List<String>> groupStrings(String[] strings) {
       Map<String, List<String>> mapToHash = new HashMap<>();

       for(String str : strings){
        String hash = getHash(str);
        if(mapToHash.get(hash)==null){
            mapToHash.put(hash, new ArrayList<>());
        }
        mapToHash.get(hash).add(str);
       }

       List<List<String>> groups = new ArrayList<>();

       for(List<String> group : mapToHash.values()){
         groups.add(group);
       }

       return groups;

    }

    public String getHash(String str){
        char[] chars = str.toCharArray();
        StringBuilder hashKey = new StringBuilder();

        for(int i=1; i<chars.length; i++){
            hashKey.append((chars[i]-chars[i-1]+26)%26 + 'a');
        }

        return hashKey.toString();
    }
}
