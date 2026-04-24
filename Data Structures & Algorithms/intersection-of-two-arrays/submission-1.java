class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
     

        for(int no : nums1){
            set1.add(no);
        }

        for(int no : nums2){
            if(set1.contains(no)){
                res.add(no);
            } 
        }

        int size = res.size();
        int [] ans = new int[size];
        int i=0;
        for(int no : res){
           ans[i] = no;
           i++;
        }

        return ans;
    }
}