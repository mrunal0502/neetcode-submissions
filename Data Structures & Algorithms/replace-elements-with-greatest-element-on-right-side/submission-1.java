class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int [] newArr = new int[n];
        int max = 0;

        for(int i=n-2; i>=0; i--){
           max = Math.max(max,arr[i+1]);
           newArr[i]=max;
        }

        newArr[n-1]=-1;

        return newArr;
    }
}