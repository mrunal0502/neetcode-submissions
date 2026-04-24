class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int no : nums1){
            set1.add(no);
        }

        for(int no : nums2){
            if(set1.contains(no) && !(set2.contains(no))){
                list.add(no);
            }

            set2.add(no);
        }

        int size = list.size();
        int [] ans = new int[size];

        for(int i=0; i<size; i++){
           ans[i] = list.get(i);
        }

        return ans;
    }
}