class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0, high = arr.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            int missing = arr[mid] - (mid+1);

            if(missing<k)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return k + high + 1;  
    }
    // public int findKthPositive(int[] arr, int k) {
    //     int n = arr.length;
    //     boolean[] integer = new boolean[arr[n-1]+1];
    //     for(int i = 0;i<n;i++){
    //         integer[arr[i]] = true;
    //     }
    //     int i;
    //     for(i=1;i<arr[n-1];i++){
    //         if(integer[i]==false){
    //             k--;
    //             if(k==0)    return i;
    //         }
    //     }
    //     while(k>0){
    //         i++;
    //         k--;
    //     }
    //     return i;
    // }
}