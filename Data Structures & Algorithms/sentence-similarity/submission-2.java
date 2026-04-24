class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        int n1 = sentence1.length;
        int n2 = sentence2.length;

         if(n1!=n2) return false;

        for(int i=0; i<n1; i++){
            if(sentence1[i].equals(sentence2[i])) continue;
            ArrayList<String> inner = new ArrayList<>();
            inner.add(sentence1[i]);
            inner.add(sentence2[i]);

            ArrayList<String> copy = new ArrayList<>(inner);
            Collections.reverse(copy);
            if(!similarPairs.contains(inner) && !similarPairs.contains(copy)) return false;
        }

        return true;
    }
}
