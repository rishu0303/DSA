class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n-k+1];
        for(int i = 0;i<n-k+1;i++){
            boolean flag = true;
            int j = i;
            for(;j<i+k-1 && flag;j++){
                if(nums[j+1]-nums[j]!=1)
                    flag = false;
            }
            if(flag){
                arr[i] = nums[j];
            }else   arr[i] = -1;
        }
        return arr;
    }
}