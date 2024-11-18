class Solution {
    public int singleNumber(int[] nums){
        int ones = 0;
        int twos = 0;
        for(int ele:nums){
            ones = (ones^ele)&(~twos);
            twos = (twos^ele)&(~ones);
        }
        return ones;
    }
    // public int singleNumber(int[] nums){
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     for(int i = 1;i<n;i+=3){
    //         if(nums[i]!=nums[i-1])  return nums[i-1];
    //     }
    //     return nums[n-1];
    // }
    // public int singleNumber(int[] nums) {
    //     int res = 0;
    //     for(int i = 0;i<32;i++){
    //         int count = 0;
    //         for(int ele:nums){
    //             if((ele&(1<<i))>0) count++;
    //         }
    //         if(count%3==1){
    //             res = res|(1<<i);
    //         }
    //     }
    //     return res;
    // }

}