class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }
      
    public static void mergeSort(int[] nums, int start, int end){
        if(start<end){
             int mid = start + (end-start)/2;
                mergeSort(nums, start, mid);
                mergeSort(nums,mid+1, end);
                merge(nums, start, mid, end);
        }
    }

    public static void merge(int[]nums, int start, int mid, int end){
        int size = end-start+1;
        int []arr = new int[size];
        
        int left = start;
        int right = mid+1;
        int k=0;
        while(left<=mid && right<=end){
            if(nums[left]<=nums[right]){
                arr[k++] = nums[left++];
            }else{
                arr[k++]=nums[right++];
            }
        }

        while(left<=mid){
            arr[k++]=nums[left++];
        }

        while(right<=end){
          arr[k++]=nums[right++];
        }

        for(int i=0; i<size; i++){
            nums[start+i]=arr[i];
        }


    }
}