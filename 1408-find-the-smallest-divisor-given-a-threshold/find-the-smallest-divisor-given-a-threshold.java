class Solution {
    public int smallestDivisor(int[] nums, int threshold){
        int n = nums.length;
        // int maxi = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        //     maxi = Math.max(maxi, nums[i]);
        // }
        int low = 1, high = 1000000;
        while (low <= high) {
            int count = 0;
            int mid = (low + high) / 2;
            for(int i = 0;i<n;i++){
                count+=nums[i]/mid;
                if(nums[i]%mid!=0)    count++;
            }
            if (count <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    // public int smallestDivisor(int[] nums, int threshold) {
    //     Arrays.sort(nums);
    //     int s = 0, n = nums.length, e = n-1;
    //     if(n > threshold) return -1;
    //     while(s<=e){
    //         int mid = s+(e-s)/2;
    //         int count = 0;
    //         for(int i = 0;i<n;i++){
    //             count+=nums[i]/nums[mid];
    //             if(nums[i]%nums[mid]!=0)    count++;
    //         }
    //         if(count == threshold)  return nums[mid];
    //         if(count<threshold)   {
    //             e = mid-1;
    //         }else{
    //             s = mid+1;
    //         }
    //     }
    //     return nums[s];
    // }
}