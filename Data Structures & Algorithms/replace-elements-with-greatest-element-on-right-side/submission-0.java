class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int [] newArr = new int[n];

        for(int i=0; i<n-1; i++){
           int max = 0;
           for(int j=i+1;j<n;j++){
              max = Math.max(max, arr[j]);
           }

           newArr[i]=max;
        }

        newArr[n-1]=-1;

        return newArr;
    }
}