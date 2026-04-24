class Solution {
    public int countElements(int[] arr) {
        // int [] nos = new int[10];

        // for(int no : arr){
        //     nos[no]++;
        // }

       
HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int count = 0;
        for (int x : arr) {
            if (set.contains(x + 1)) {
                count++; // duplicates are counted naturally
            }
        }
        return count;

    }
}
