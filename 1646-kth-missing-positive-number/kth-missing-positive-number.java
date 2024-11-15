class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        boolean[] integer = new boolean[arr[n-1]+1];
        for(int i = 0;i<n;i++){
            integer[arr[i]] = true;
        }
        int i;
        for(i=1;i<arr[n-1];i++){
            if(integer[i]==false){
                k--;
                if(k==0)    return i;
            }
        }
        while(k>0){
            i++;
            k--;
        }
        return i;
        // ArrayList<Integer> list = new ArrayList<>();
        // int  i = 1;
        // int res = 1;
        // while(k > 0){
        //     if(!search(arr,i)){
        //         res = i;
        //         k--;
        //     }
        //     i++;
        // }
        // return res;
    }
    // public boolean search(int[] nums, int target) {
    //     int l = 0;
    //     int h = nums.length-1;
    //     int mid;
    //     while(l<=h){
    //         mid = (l+h)/2;
    //         if(nums[mid]==target)   return true;
    //         else if(nums[mid]>target)   h = mid-1;
    //         else    l = mid+1;
    //     }
    //     return false;
    // }
}